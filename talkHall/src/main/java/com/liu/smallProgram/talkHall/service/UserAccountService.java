package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.UserAccountMapper;
import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * The type User account service.
 */
@Service("UserAccountService")
public class UserAccountService extends BaseService<UserAccountEntity> {
    /**
     * The Mapper.
     */
    @Autowired(required = false)
    UserAccountMapper mapper;

    public UserAccountMapper getMapper() {
        return this.mapper;
    }

    /**
     * 注册新账号的业务逻辑
     * @param entity
     * @return
     */
    public boolean signUp(UserAccountEntity entity){
        int flag = 0;
        if (!checkUserExists(entity.getUserAccount())){  //检测账号是否存在
            flag = mapper.insert(entity);
        }
        if (flag == 1)
            return true;
        else
            return false;
    }


    /**
     * 检测账号是否已经存在   存在(或传参为空)-true  不存在-false
     * @param userAccount
     * @return
     */
    public boolean checkUserExists(String userAccount){
        if (userAccount!=null && mapper.ifUserExists(userAccount).equals(0)){ //不为空  且  查不到该user  ->不存在
            return false;
        }else {   //为空  或  能查到  ->存在
            return true;
        }
    }

    /**
     * 进行登录操作    返回值为int类型，后续处理在controller中进行
     *                    9-用户名与密码匹配，0-用户名或密码未输入，-1 -用户名或密码错误
     * @param userAccount
     * @param password
     * @return
     */
    public int signIn(String userAccount,String password){
        Integer result;
        if ("".equals(userAccount) || "".equals(password) || null==userAccount || null== password  ){
            result = 0;
        }else{
            result = mapper.signIn(userAccount,password);
            if(null == result){
                result=-1; //如果查询不到，则设置为账号或密码错误
            }
        }
        return result;
    }
}