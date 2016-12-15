package com.liu.smallProgram.talkHall.dao;

import com.liu.smallProgram.talkHall.model.MessageBoardHall;
import com.liu.smallProgram.talkHall.model.MessageBoardHallExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBoardHallMapper {
    int countByExample(MessageBoardHallExample example);

    int deleteByExample(MessageBoardHallExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(MessageBoardHall record);

    int insertSelective(MessageBoardHall record);

    List<MessageBoardHall> selectByExampleWithBLOBs(MessageBoardHallExample example);

    List<MessageBoardHall> selectByExample(MessageBoardHallExample example);

    MessageBoardHall selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") MessageBoardHall record, @Param("example") MessageBoardHallExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageBoardHall record, @Param("example") MessageBoardHallExample example);

    int updateByExample(@Param("record") MessageBoardHall record, @Param("example") MessageBoardHallExample example);

    int updateByPrimaryKeySelective(MessageBoardHall record);

    int updateByPrimaryKeyWithBLOBs(MessageBoardHall record);

    int updateByPrimaryKey(MessageBoardHall record);
}