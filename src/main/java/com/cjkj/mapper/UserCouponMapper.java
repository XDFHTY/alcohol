package com.cjkj.mapper;

import com.cjkj.entity.UserCoupon;

public interface UserCouponMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userCouponId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserCoupon record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserCoupon record);

    /**
     *
     * @mbggenerated
     */
    UserCoupon selectByPrimaryKey(Long userCouponId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserCoupon record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserCoupon record);
}