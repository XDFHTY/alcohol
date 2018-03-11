package com.cjkj.mapper;

import com.cjkj.entity.CouponCate;

public interface CouponCateMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long couponCateId);

    /**
     *
     * @mbggenerated
     */
    int insert(CouponCate record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CouponCate record);

    /**
     *
     * @mbggenerated
     */
    CouponCate selectByPrimaryKey(Long couponCateId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CouponCate record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CouponCate record);
}