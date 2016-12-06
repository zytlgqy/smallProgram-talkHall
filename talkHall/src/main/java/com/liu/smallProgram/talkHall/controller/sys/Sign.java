package com.liu.smallProgram.talkHall.controller.sys;

import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import com.liu.smallProgram.talkHall.entity.UserInfoEntity;
import com.liu.smallProgram.talkHall.service.UserAccountService;
import com.liu.smallProgram.talkHall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
@RequestMapping("signIn")
public class Sign {
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    UserAccountService userAccountService;

    @RequestMapping("signIn")
    public ModelAndView signIn(UserInfoEntity entity){

        return new ModelAndView("welcome");
    }

    /**
     * 注册账户
     * @param entity
     * @return
     */
    @RequestMapping(value = "signUp",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView signUp(UserAccountEntity entity){
        Map map = checkUserAccount(entity);
        int flag = (Integer) map.get("result");
        if (flag != 0){
            return new ModelAndView("signUpFailed",map);
        }else {
            if (userAccountService.signUp(entity)){
                return new ModelAndView("welcome");
            }else {
                return new ModelAndView("signUpFailed",map);
            }
        }
    }


    /**
     * 检测entity是否可以使用  包括了 1-是否为空   2-是否已经具有id    0-没问题，成功
     * @param entity
     * @return
     */
    private Map<String,Object> checkUserAccount(UserAccountEntity entity){
        Map<String,Object> map = new HashMap<String, Object>();

        if (null == entity){
            map.put("result",1);
            map.put("msg","entity is null");
        }else if (null == entity.getUserId()){
            map.put("result",2);
            map.put("msg","entity has id, it will affect other record");
        }else {
            map.put("result",0);
            map.put("msg","entity is okay");
        }
        return map;
    }

}
