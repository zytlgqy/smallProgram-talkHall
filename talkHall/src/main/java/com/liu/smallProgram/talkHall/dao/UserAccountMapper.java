package com.liu.smallProgram.talkHall.dao;

import com.liu.smallProgram.talkHall.entity.UserAccountEntity;
import org.apache.ibatis.annotations.Param;

/**
 * The interface User account mapper.
 */
public interface UserAccountMapper extends BaseMapper<UserAccountEntity> {

    int ifUserExists(@Param("userAccount") String userAccount);

}