package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.ImagesResourceMapper;
import com.liu.smallProgram.talkHall.entity.ImagesResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/21   21:06   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
public class ImagesResourceService extends BaseService<ImagesResourceEntity> {
    @Autowired
    ImagesResourceMapper mapper;
    public BaseMapper<ImagesResourceEntity> getMapper() {return this.mapper;}
}
