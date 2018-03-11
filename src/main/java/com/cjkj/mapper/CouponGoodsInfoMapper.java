package com.cjkj.mapper;

import com.cjkj.entity.CouponGoodsInfo;

public interface CouponGoodsInfoMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long couponGoodsInfoId);

    /**
     *
     * @mbggenerated
     */
    int insert(CouponGoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CouponGoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    CouponGoodsInfo selectByPrimaryKey(Long couponGoodsInfoId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CouponGoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CouponGoodsInfo record);
}