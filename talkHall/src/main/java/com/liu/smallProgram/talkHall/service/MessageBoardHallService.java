package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.dao.MessageBoardHallMapper;
import com.liu.smallProgram.talkHall.entity.MessageBoardHallEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Message board hall service.
 */
@Service
public class MessageBoardHallService {
    /**
     * The Mapper.
     */
    @Autowired
    MessageBoardHallMapper mapper;

    /**
     * Delete by primary key int.
     *
     * @param messageId the message id
     * @return the int
     */
    int deleteByPrimaryKey(Integer messageId) {
        return mapper.deleteByPrimaryKey(messageId);
    }

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    int insert(MessageBoardHallEntity record) {
        return mapper.insert(record);
    }

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    int insertSelective(MessageBoardHallEntity record) {
        return insertSelective(record);
    }

    /**
     * Select by primary key message board hall entity.
     *
     * @param messageId the message id
     * @return the message board hall entity
     */
    MessageBoardHallEntity selectByPrimaryKey(Integer messageId) {
        return mapper.selectByPrimaryKey(messageId);
    }

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKeySelective(MessageBoardHallEntity record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    int updateByPrimaryKey(MessageBoardHallEntity record) {
        return mapper.updateByPrimaryKey(record);
    }
}