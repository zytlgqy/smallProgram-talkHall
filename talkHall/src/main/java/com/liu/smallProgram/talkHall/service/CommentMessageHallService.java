package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.CommentMessageHallMapper;
import com.liu.smallProgram.talkHall.entity.CommentMessageHallEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Comment message hall service.
 *
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00 2016/12/6   14:45   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
@Service("CommentMessageHallService")
public class CommentMessageHallService extends BaseService<CommentMessageHallEntity> {
    /**
     * The Mapper.
     */
    @Autowired(required = false)
    CommentMessageHallMapper mapper;

    public BaseMapper<CommentMessageHallEntity> getMapper() {
        return this.mapper;
    }


}
