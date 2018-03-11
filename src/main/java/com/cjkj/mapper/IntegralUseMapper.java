package com.cjkj.mapper;

import com.cjkj.entity.IntegralUse;

public interface IntegralUseMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long integralUseId);

    /**
     *
     * @mbggenerated
     */
    int insert(IntegralUse record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(IntegralUse record);

    /**
     *
     * @mbggenerated
     */
    IntegralUse selectByPrimaryKey(Long integralUseId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IntegralUse record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IntegralUse record);
}