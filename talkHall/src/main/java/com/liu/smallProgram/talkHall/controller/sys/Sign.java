package com.liu.smallProgram.talkHall.controller.sys;

import com.alibaba.druid.support.json.JSONUtils;
import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import com.liu.smallProgram.talkHall.entity.UserInfoEntity;
import com.liu.smallProgram.talkHall.model.UserAccount;
import com.liu.smallProgram.talkHall.service.UserAccountService;
import com.liu.smallProgram.talkHall.service.UserInfoService;
import com.liu.smallProgram.talkHall.utils.ResultHandle;
import com.liu.smallProgram.talkHall.utils.Transform;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/6   15:46   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
@Controller
@RequestMapping("sign")
public class Sign {
    private static  final Logger LOGGER = LoggerFactory.getLogger(Sign.class);

    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserAccountService userAccountService;


    /**
     * 注册账户
     * @param model
     * @return
     */
    @RequestMapping(value = "signUp",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView signUp(UserAccount model){
        UserAccountEntity entity =new UserAccountEntity();
        Map<String,Object> mapToReturn = new HashMap<String,Object>();
        String page;  //page是用来存view的

        //进行两次密码是否一致的验证，并且将model转为entity
        if (checkPasswordConfirm(model.getUserPassword(),model.getUserPasswordRepeat())){
            Transform.TransformModelToEntity(model,entity);
        }else {
            page= "index";
            ResultHandle.setResultMapFailedOriginal(mapToReturn,"两次输入密码不一致，请不要尝试修改前端的内容");
            return new ModelAndView(page,mapToReturn);
        }

        //map 存放结果 该函数检测entity的完整性  result-0:可用  1:entity是空的    2:该entity已经有了id
        Map map = checkUserAccount(entity);
        int flag = (Integer) map.get("result");
        switch (flag){  //一点也不优雅   应该把这部分放在下面的工具函数里面  或者放在service层
            case 1:
                page = "index";
                ResultHandle.setResultMapFailedOriginal(mapToReturn,"请输入账号密码");
                break;
            case 2://目前这种情况貌似不存在
                page = "index";
                ResultHandle.setResultMapFailedOriginal(mapToReturn,"您已登录，请先退出登录再进行尝试");
                break;
            case 0:
                page = "index";
                if (!userAccountService.checkUserExists(entity.getUserAccount())){
                    entity.setCreateTime(new Date());
                    entity.setLastUpdateTime(new Date());
                    entity.setUserState(1);
                    if (userAccountService.signUp(entity)){
                        ResultHandle.setResultMapSucceedOriginal(mapToReturn,"注册成功，请尝试登陆");
                    }else {
                        ResultHandle.setResultMapFailedOriginal(mapToReturn,"向数据库写入错误，请重新尝试");
                    }
                }else {
                    ResultHandle.setResultMapFailedOriginal(mapToReturn,"该账号已被注册");
                }
                break;
            default:
                page = "index";
                ResultHandle.setResultMapFailedOriginal(mapToReturn,"后台异常，请重新尝试");
                break;
        }


        return new ModelAndView(page,mapToReturn);
    }

    /**
     * 登录的处理函数
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/signIn")
    public ModelAndView signIn(String userName, String password, HttpSession session){
        Map<String,Object> mapToReturn = new HashMap<String,Object>();
        Map<String,String> mapMsg = new HashMap<String,String>();
        String msg,page;
        Integer userAccountId = userAccountService.signIn(userName,password);

//        0-输入值当中有空值   1-用户名或密码错误  default-成功
        switch (userAccountId){
            case 0:
                mapMsg.put("info","用户名或密码为空");
                msg = JSONUtils.toJSONString(mapMsg);
                ResultHandle.setResultMapFailed(mapToReturn,msg);
                page = "index";
                break;
            case -1:
                mapMsg.put("info","用户名或密码错误");
                msg = JSONUtils.toJSONString(mapMsg);
                ResultHandle.setResultMapFailed(mapToReturn,msg);
                page = "index";
                break;
            default:
                msg = handleSignInSucceed(session, userName,userAccountId,mapMsg);
                ResultHandle.setResultMapSucceed(mapToReturn,msg);
                page = "mainPage";
                break;
        }
        return new ModelAndView(page,mapToReturn);
    }


    /**
     *   工具函数     进行返回结果的拼装
     * @param session
     * @param userName
     * @param userAccountId
     * @return
     */
    private String handleSignInSucceed(HttpSession session,String userName,Integer userAccountId,Map map2){
        session.setAttribute("userName",userName);


        UserInfoEntity userInfoEntity = userInfoService.selectByPrimaryKey(userAccountId);
        map2.put("userNickName",userInfoEntity.getUserNameNick());
        map2.put("userAvatar",userInfoEntity.getUserAvatar());
        map2.put("userPersonalizedSignature",userInfoEntity.getUserPersonalizedSignature());
        return JSONUtils.toJSONString(map2);
    }




    /**
     * 工具函数
     * 检测账号名称是否可以使用  包括了 1-为空   2-已经具有id    0-没问题，成功
     * @param entity
     * @return
     */
    private Map<String,Object> checkUserAccount(UserAccountEntity entity){
        Map<String,Object> map = new HashMap<String, Object>();

        if (null == entity || null == entity.getUserAccount()){
            map.put("result",1);
            map.put("msg","entity is null");
        }else if (null != entity.getUserId()){
            map.put("result",2);
            map.put("msg","entity has id, it will affect other record");
        }else {
            map.put("result",0);
            map.put("msg","entity is okay");
        }
        return map;
    }

    /**
     * 工具函数，校验两次密码是否一致
     * @param password
     * @param passwordRepeat
     * @return
     */
    private Boolean checkPasswordConfirm(String password,String passwordRepeat){
        if (null != password && null!=passwordRepeat){
            return true;
        }else {
            return false;
        }
    }
}
