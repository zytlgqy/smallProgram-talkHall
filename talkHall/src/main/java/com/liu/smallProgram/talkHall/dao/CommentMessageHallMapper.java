package com.liu.smallProgram.talkHall.dao;

import com.liu.smallProgram.talkHall.model.CommentMessageHall;
import com.liu.smallProgram.talkHall.model.CommentMessageHallExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMessageHallMapper {
    int countByExample(CommentMessageHallExample example);

    int deleteByExample(CommentMessageHallExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentMessageHall record);

    int insertSelective(CommentMessageHall record);

    List<CommentMessageHall> selectByExampleWithBLOBs(CommentMessageHallExample example);

    List<CommentMessageHall> selectByExample(CommentMessageHallExample example);

    CommentMessageHall selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") CommentMessageHall record, @Param("example") CommentMessageHallExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentMessageHall record, @Param("example") CommentMessageHallExample example);

    int updateByExample(@Param("record") CommentMessageHall record, @Param("example") CommentMessageHallExample example);

    int updateByPrimaryKeySelective(CommentMessageHall record);

    int updateByPrimaryKeyWithBLOBs(CommentMessageHall record);

    int updateByPrimaryKey(CommentMessageHall record);
}