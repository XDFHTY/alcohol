package com.cjkj.mapper;

import com.cjkj.entity.Integral;

public interface IntegralMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long integralId);

    /**
     *
     * @mbggenerated
     */
    int insert(Integral record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Integral record);

    /**
     *
     * @mbggenerated
     */
    Integral selectByPrimaryKey(Long integralId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Integral record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Integral record);
}