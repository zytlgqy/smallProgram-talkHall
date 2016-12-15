package com.liu.smallProgram.talkHall.dao;

import com.liu.smallProgram.talkHall.model.DepartmentBelongs;
import com.liu.smallProgram.talkHall.model.DepartmentBelongsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentBelongsMapper {
    int countByExample(DepartmentBelongsExample example);

    int deleteByExample(DepartmentBelongsExample example);

    int deleteByPrimaryKey(Integer departmentBelongsId);

    int insert(DepartmentBelongs record);

    int insertSelective(DepartmentBelongs record);

    List<DepartmentBelongs> selectByExample(DepartmentBelongsExample example);

    DepartmentBelongs selectByPrimaryKey(Integer departmentBelongsId);

    int updateByExampleSelective(@Param("record") DepartmentBelongs record, @Param("example") DepartmentBelongsExample example);

    int updateByExample(@Param("record") DepartmentBelongs record, @Param("example") DepartmentBelongsExample example);

    int updateByPrimaryKeySelective(DepartmentBelongs record);

    int updateByPrimaryKey(DepartmentBelongs record);
}