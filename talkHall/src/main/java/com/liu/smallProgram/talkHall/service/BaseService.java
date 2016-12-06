package com.liu.smallProgram.talkHall.service;


import com.liu.smallProgram.talkHall.dao.BaseMapper;

/**
 * The type Base service.
 *
 * @param <T> the type parameter
 */
public abstract class BaseService <T>{

    /**
     * Gets mapper.
     *
     * @return the mapper
     */
    public abstract BaseMapper<T> getMapper();

    /**
     * Delete by primary key int.
     *
     * @param id the id
     * @return the int
     */
    public  int deleteByPrimaryKey(Integer id) { return getMapper().deleteByPrimaryKey(id);}

    /**
     * Insert int.
     *
     * @param record the record
     * @return the int
     */
    public int insert(T record) {
        return getMapper().insert(record);
    }

    /**
     * Insert selective int.
     *
     * @param record the record
     * @return the int
     */
    public int insertSelective(T record) {
        return getMapper().insertSelective(record);
    }

    /**
     * Select by primary key t.
     *
     * @param id the id
     * @return the t
     */
    public T selectByPrimaryKey(Integer id) {
        return getMapper().selectByPrimaryKey(id);
    }

    /**
     * Update by primary key selective int.
     *
     * @param record the record
     * @return the int
     */
    public int updateByPrimaryKeySelective(T record) { return getMapper().updateByPrimaryKeySelective(record);}

    /**
     * Update by primary key int.
     *
     * @param record the record
     * @return the int
     */
    public int updateByPrimaryKey(T record) {
        return getMapper().updateByPrimaryKey(record);
    }
}