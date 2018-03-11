package com.cjkj.mapper;

import com.cjkj.entity.Coupon;

public interface CouponMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long couponId);

    /**
     *
     * @mbggenerated
     */
    int insert(Coupon record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Coupon record);

    /**
     *
     * @mbggenerated
     */
    Coupon selectByPrimaryKey(Long couponId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Coupon record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Coupon record);
}