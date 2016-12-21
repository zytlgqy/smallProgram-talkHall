package com.liu.smallProgram.talkHall.dao;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import org.apache.ibatis.annotations.Param;

public interface UserAccountMapper extends BaseMapper<UserAccountEntity> {

    Integer ifUserExists(@Param("userAccount")String  userAccount);

    Integer signIn(@Param("userAccount")String userAccount,@Param("userPassword")String userPassword);
}