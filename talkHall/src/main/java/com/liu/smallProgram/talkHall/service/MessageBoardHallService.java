package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.MessageBoardHallMapper;
import com.liu.smallProgram.talkHall.entity.MessageBoardHallEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Message board hall service.
 */
@Service("MessageBoardHallService")
public class MessageBoardHallService extends BaseService<MessageBoardHallEntity> {
    /**
     * The Mapper.
     */
    @Autowired(required = false)
    MessageBoardHallMapper mapper;

    public BaseMapper<MessageBoardHallEntity> getMapper() {
        return this.mapper;
    }

}