package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.PrivateMessageHallMapper;
import com.liu.smallProgram.talkHall.entity.PrivateMessageHallEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/21   21:07   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
public class PrivateMessageHallService extends BaseService<PrivateMessageHallEntity> {
    @Autowired
    PrivateMessageHallMapper mapper;
    public BaseMapper<PrivateMessageHallEntity> getMapper() {return this.mapper;}

}
