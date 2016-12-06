package com.liu.smallProgram.talkHall.dao;


public interface BaseMapper <T>{
    int deleteByPrimaryKey(Integer userInfoId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer userInfoId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}