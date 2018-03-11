package com.cjkj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    /**
     * 优惠券表
     */
    private Long couponId;

    /**
     * 优惠券名称
     */
    private String couponName;

    /**
     * 优惠券备注
     */
    private String couponRemark;

    /**
     * 开始时间
     */
    private Date couponStartTime;

    /**
     * 结束时间
     */
    private Date couponEndTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 0-未发布，1-已发布
     */
    private String couponIsShow;

    /**
     * 图片
     */
    private String couponPic;

    /**
     * 1-满减，2-直降，3-不限
     */
    private String couponRulesType;

    /**
     * 优惠券价值
     */
    private BigDecimal couponPrice;

    /**
     * 满多少钱
     */
    private BigDecimal fullbuyPrice;

    /**
     * 减多少钱
     */
    private BigDecimal reducePrice;

    /**
     * 可领取张数，默认为1
     */
    private Long couponGetNo;

    /**
     * 1-用户自领，2-系统发放，默认为1
     */
    private String couponGetType;

    /**
     * 生成张数
     */
    private Long couponCount;

    /**
     * 1-指定商品可用，2-全平台可用，默认为2
     */
    private String isAll;

    /**
     * 优惠券分类ID（coupon_cata表主键）
     */
    private Long couponCateId;

    /**
     * 优惠券表
     * @return coupon_id 优惠券表
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 优惠券表
     * @param couponId 优惠券表
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 优惠券名称
     * @return coupon_name 优惠券名称
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * 优惠券名称
     * @param couponName 优惠券名称
     */
    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    /**
     * 优惠券备注
     * @return coupon_remark 优惠券备注
     */
    public String getCouponRemark() {
        return couponRemark;
    }

    /**
     * 优惠券备注
     * @param couponRemark 优惠券备注
     */
    public void setCouponRemark(String couponRemark) {
        this.couponRemark = couponRemark == null ? null : couponRemark.trim();
    }

    /**
     * 开始时间
     * @return coupon_start_time 开始时间
     */
    public Date getCouponStartTime() {
        return couponStartTime;
    }

    /**
     * 开始时间
     * @param couponStartTime 开始时间
     */
    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    /**
     * 结束时间
     * @return coupon_end_time 结束时间
     */
    public Date getCouponEndTime() {
        return couponEndTime;
    }

    /**
     * 结束时间
     * @param couponEndTime 结束时间
     */
    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 0-未发布，1-已发布
     * @return coupon_is_show 0-未发布，1-已发布
     */
    public String getCouponIsShow() {
        return couponIsShow;
    }

    /**
     * 0-未发布，1-已发布
     * @param couponIsShow 0-未发布，1-已发布
     */
    public void setCouponIsShow(String couponIsShow) {
        this.couponIsShow = couponIsShow == null ? null : couponIsShow.trim();
    }

    /**
     * 图片
     * @return coupon_pic 图片
     */
    public String getCouponPic() {
        return couponPic;
    }

    /**
     * 图片
     * @param couponPic 图片
     */
    public void setCouponPic(String couponPic) {
        this.couponPic = couponPic == null ? null : couponPic.trim();
    }

    /**
     * 1-满减，2-直降，3-不限
     * @return coupon_rules_type 1-满减，2-直降，3-不限
     */
    public String getCouponRulesType() {
        return couponRulesType;
    }

    /**
     * 1-满减，2-直降，3-不限
     * @param couponRulesType 1-满减，2-直降，3-不限
     */
    public void setCouponRulesType(String couponRulesType) {
        this.couponRulesType = couponRulesType == null ? null : couponRulesType.trim();
    }

    /**
     * 优惠券价值
     * @return coupon_price 优惠券价值
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * 优惠券价值
     * @param couponPrice 优惠券价值
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 满多少钱
     * @return fullbuy_price 满多少钱
     */
    public BigDecimal getFullbuyPrice() {
        return fullbuyPrice;
    }

    /**
     * 满多少钱
     * @param fullbuyPrice 满多少钱
     */
    public void setFullbuyPrice(BigDecimal fullbuyPrice) {
        this.fullbuyPrice = fullbuyPrice;
    }

    /**
     * 减多少钱
     * @return reduce_price 减多少钱
     */
    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    /**
     * 减多少钱
     * @param reducePrice 减多少钱
     */
    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
    }

    /**
     * 可领取张数，默认为1
     * @return coupon_get_no 可领取张数，默认为1
     */
    public Long getCouponGetNo() {
        return couponGetNo;
    }

    /**
     * 可领取张数，默认为1
     * @param couponGetNo 可领取张数，默认为1
     */
    public void setCouponGetNo(Long couponGetNo) {
        this.couponGetNo = couponGetNo;
    }

    /**
     * 1-用户自领，2-系统发放，默认为1
     * @return coupon_get_type 1-用户自领，2-系统发放，默认为1
     */
    public String getCouponGetType() {
        return couponGetType;
    }

    /**
     * 1-用户自领，2-系统发放，默认为1
     * @param couponGetType 1-用户自领，2-系统发放，默认为1
     */
    public void setCouponGetType(String couponGetType) {
        this.couponGetType = couponGetType == null ? null : couponGetType.trim();
    }

    /**
     * 生成张数
     * @return coupon_count 生成张数
     */
    public Long getCouponCount() {
        return couponCount;
    }

    /**
     * 生成张数
     * @param couponCount 生成张数
     */
    public void setCouponCount(Long couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 1-指定商品可用，2-全平台可用，默认为2
     * @return is_all 1-指定商品可用，2-全平台可用，默认为2
     */
    public String getIsAll() {
        return isAll;
    }

    /**
     * 1-指定商品可用，2-全平台可用，默认为2
     * @param isAll 1-指定商品可用，2-全平台可用，默认为2
     */
    public void setIsAll(String isAll) {
        this.isAll = isAll == null ? null : isAll.trim();
    }

    /**
     * 优惠券分类ID（coupon_cata表主键）
     * @return coupon_cate_id 优惠券分类ID（coupon_cata表主键）
     */
    public Long getCouponCateId() {
        return couponCateId;
    }

    /**
     * 优惠券分类ID（coupon_cata表主键）
     * @param couponCateId 优惠券分类ID（coupon_cata表主键）
     */
    public void setCouponCateId(Long couponCateId) {
        this.couponCateId = couponCateId;
    }
}