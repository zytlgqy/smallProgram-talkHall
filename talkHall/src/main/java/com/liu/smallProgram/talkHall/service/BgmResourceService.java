package com.liu.smallProgram.talkHall.service;

import com.liu.smallProgram.talkHall.core.BaseMapper;
import com.liu.smallProgram.talkHall.core.BaseService;
import com.liu.smallProgram.talkHall.dao.BgmResourceMapper;
import com.liu.smallProgram.talkHall.entity.BgmResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/21   21:03   Liu Zhaoyang  created
 * @description 类的详细说明
 * @history
 */
public class BgmResourceService extends BaseService<BgmResourceEntity> {
    @Autowired
    BgmResourceMapper mapper;
    public BaseMapper<BgmResourceEntity> getMapper() {return this.mapper;}

}
