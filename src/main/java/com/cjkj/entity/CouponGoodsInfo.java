package com.cjkj.entity;

public class CouponGoodsInfo {
    /**
     * 优惠券-货品关联表，指定哪些货品可以使用此优惠券
     */
    private Long couponGoodsInfoId;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 货品ID
     */
    private Long goodsInfoId;

    /**
     * 优惠券-货品关联表，指定哪些货品可以使用此优惠券
     * @return coupon_goods_info_id 优惠券-货品关联表，指定哪些货品可以使用此优惠券
     */
    public Long getCouponGoodsInfoId() {
        return couponGoodsInfoId;
    }

    /**
     * 优惠券-货品关联表，指定哪些货品可以使用此优惠券
     * @param couponGoodsInfoId 优惠券-货品关联表，指定哪些货品可以使用此优惠券
     */
    public void setCouponGoodsInfoId(Long couponGoodsInfoId) {
        this.couponGoodsInfoId = couponGoodsInfoId;
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