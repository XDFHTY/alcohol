package com.cjkj.entity;

import java.util.Date;

public class UserCoupon {
    /**
     * 用户-优惠券关联表（用户拥有哪些优惠券）
     */
    private Long userCouponId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 1-可用（未使用），0-禁用（已使用）
     */
    private String state;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 货品ID
     */
    private Long goodsInfoId;

    /**
     * 用户-优惠券关联表（用户拥有哪些优惠券）
     * @return user_coupon_id 用户-优惠券关联表（用户拥有哪些优惠券）
     */
    public Long getUserCouponId() {
        return userCouponId;
    }

    /**
     * 用户-优惠券关联表（用户拥有哪些优惠券）
     * @param userCouponId 用户-优惠券关联表（用户拥有哪些优惠券）
     */
    public void setUserCouponId(Long userCouponId) {
        this.userCouponId = userCouponId;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 优惠券ID
     * @return coupon_id 优惠券ID
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 优惠券ID
     * @param couponId 优惠券ID
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 1-可用（未使用），0-禁用（已使用）
     * @return state 1-可用（未使用），0-禁用（已使用）
     */
    public String getState() {
        return state;
    }

    /**
     * 1-可用（未使用），0-禁用（已使用）
     * @param state 1-可用（未使用），0-禁用（已使用）
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 使用时间
     * @return use_time 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 使用时间
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 货品ID
     * @return goods_info_id 货品ID
     */
    public Long getGoodsInfoId() {
        return goodsInfoId;
    }

    /**
     * 货品ID
     * @param goodsInfoId 货品ID
     */
    public void setGoodsInfoId(Long goodsInfoId) {
        this.goodsInfoId = goodsInfoId;
    }
}