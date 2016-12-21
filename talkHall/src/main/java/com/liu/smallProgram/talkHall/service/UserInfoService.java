package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.UserInfoMapper;
import com.liu.smallProgram.talkHall.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type User info service.
 */
@Service("UserInfoService")
public class UserInfoService extends BaseService<UserInfoEntity> {
    /**
     * The Mapper.
     */
    @Autowired(required = false)
    UserInfoMapper mapper;

    public BaseMapper<UserInfoEntity> getMapper() {
        return this.mapper;
    }

}