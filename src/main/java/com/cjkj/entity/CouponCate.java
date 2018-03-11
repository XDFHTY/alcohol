package com.cjkj.entity;

public class CouponCate {
    /**
     * 优惠券类型表
     */
    private Long couponCateId;

    /**
     * 分类名称
     */
    private String couponCateName;

    /**
     * 优惠券类型表
     * @return coupon_cate_id 优惠券类型表
     */
    public Long getCouponCateId() {
        return couponCateId;
    }

    /**
     * 优惠券类型表
     * @param couponCateId 优惠券类型表
     */
    public void setCouponCateId(Long couponCateId) {
        this.couponCateId = couponCateId;
    }

    /**
     * 分类名称
     * @return coupon_cate_name 分类名称
     */
    public String getCouponCateName() {
        return couponCateName;
    }

    /**
     * 分类名称
     * @param couponCateName 分类名称
     */
    public void setCouponCateName(String couponCateName) {
        this.couponCateName = couponCateName == null ? null : couponCateName.trim();
    }
}