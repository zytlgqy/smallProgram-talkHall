package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.dao.BaseMapper;
import com.liu.smallProgram.talkHall.dao.UserAccountMapper;
import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * The type User account service.
 */
@Service
public class UserAccountService extends BaseService<UserAccountEntity>{
    /**
     * The Mapper.
     */
    @Autowired
    UserAccountMapper mapper;

    public BaseMapper<UserAccountEntity> getMapper() {
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
     * 检测账号是否已经存在   存在-true  不存在-false
     * @param userAccount
     * @return
     */
    public boolean checkUserExists(String userAccount){
        if (userAccount!=null && mapper.ifUserExists(userAccount) == 0){ //不为空  且  查不到  ->不存在
            return false;
        }else {   //为空  或  能查到  ->存在
            return true;
        }
    }
}