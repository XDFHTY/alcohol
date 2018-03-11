package com.cjkj.mapper;

import com.cjkj.entity.Pay;

public interface PayMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long payId);

    /**
     *
     * @mbggenerated
     */
    int insert(Pay record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Pay record);

    /**
     *
     * @mbggenerated
     */
    Pay selectByPrimaryKey(Long payId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Pay record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Pay record);
}