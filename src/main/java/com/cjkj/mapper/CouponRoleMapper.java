package com.cjkj.mapper;

import com.cjkj.entity.CouponRole;

public interface CouponRoleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long couponRole);

    /**
     *
     * @mbggenerated
     */
    int insert(CouponRole record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CouponRole record);

    /**
     *
     * @mbggenerated
     */
    CouponRole selectByPrimaryKey(Long couponRole);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CouponRole record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CouponRole record);
}