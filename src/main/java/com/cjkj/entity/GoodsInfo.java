package com.cjkj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsInfo {
    /**
     * 货品表
     */
    private Long goodsInfoId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 货品名称
     */
    private String goodsInfoName;

    /**
     * 货品副标题
     */
    private String goodsInfoSubtitle;

    /**
     * 0-下架，1-上架
     */
    private String goodsInfoAdded;

    /**
     * 上架时间
     */
    private Date goodsInfoAddedTime;

    /**
     * 下架时间
     */
    private Date goodsInfoUnaddedTime;

    /**
     * 库存
     */
    private Long goodsInfoStock;

    /**
     * 销售价
     */
    private BigDecimal goodsInfoPreferPrice;

    /**
     * 成本价
     */
    private BigDecimal goodsInfoCostPrice;

    /**
     * 市场价（原价）
     */
    private BigDecimal goodsInfoMarketPrice;

    /**
     * 会员价
     */
    private Integer goodsInfoMemberPrice;

    /**
     * 0-禁用优惠券，1-可用优惠券
     */
    private String goodsInfoUsecoupon;

    /**
     * 创建人ID
     */
    private Long founderId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 操作员ID
     */
    private Long operatorId;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 货品表
     * @return goods_info_id 货品表
     */
    public Long getGoodsInfoId() {
        return goodsInfoId;
    }

    /**
     * 货品表
     * @param goodsInfoId 货品表
     */
    public void setGoodsInfoId(Long goodsInfoId) {
        this.goodsInfoId = goodsInfoId;
    }

    /**
     * 商品ID
     * @return goods_id 商品ID
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 商品ID
     * @param goodsId 商品ID
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 货品名称
     * @return goods_info_name 货品名称
     */
    public String getGoodsInfoName() {
        return goodsInfoName;
    }

    /**
     * 货品名称
     * @param goodsInfoName 货品名称
     */
    public void setGoodsInfoName(String goodsInfoName) {
        this.goodsInfoName = goodsInfoName == null ? null : goodsInfoName.trim();
    }

    /**
     * 货品副标题
     * @return goods_info_subtitle 货品副标题
     */
    public String getGoodsInfoSubtitle() {
        return goodsInfoSubtitle;
    }

    /**
     * 货品副标题
     * @param goodsInfoSubtitle 货品副标题
     */
    public void setGoodsInfoSubtitle(String goodsInfoSubtitle) {
        this.goodsInfoSubtitle = goodsInfoSubtitle == null ? null : goodsInfoSubtitle.trim();
    }

    /**
     * 0-下架，1-上架
     * @return goods_info_added 0-下架，1-上架
     */
    public String getGoodsInfoAdded() {
        return goodsInfoAdded;
    }

    /**
     * 0-下架，1-上架
     * @param goodsInfoAdded 0-下架，1-上架
     */
    public void setGoodsInfoAdded(String goodsInfoAdded) {
        this.goodsInfoAdded = goodsInfoAdded == null ? null : goodsInfoAdded.trim();
    }

    /**
     * 上架时间
     * @return goods_info_added_time 上架时间
     */
    public Date getGoodsInfoAddedTime() {
        return goodsInfoAddedTime;
    }

    /**
     * 上架时间
     * @param goodsInfoAddedTime 上架时间
     */
    public void setGoodsInfoAddedTime(Date goodsInfoAddedTime) {
        this.goodsInfoAddedTime = goodsInfoAddedTime;
    }

    /**
     * 下架时间
     * @return goods_info_unadded_time 下架时间
     */
    public Date getGoodsInfoUnaddedTime() {
        return goodsInfoUnaddedTime;
    }

    /**
     * 下架时间
     * @param goodsInfoUnaddedTime 下架时间
     */
    public void setGoodsInfoUnaddedTime(Date goodsInfoUnaddedTime) {
        this.goodsInfoUnaddedTime = goodsInfoUnaddedTime;
    }

    /**
     * 库存
     * @return goods_info_stock 库存
     */
    public Long getGoodsInfoStock() {
        return goodsInfoStock;
    }

    /**
     * 库存
     * @param goodsInfoStock 库存
     */
    public void setGoodsInfoStock(Long goodsInfoStock) {
        this.goodsInfoStock = goodsInfoStock;
    }

    /**
     * 销售价
     * @return goods_info_prefer_price 销售价
     */
    public BigDecimal getGoodsInfoPreferPrice() {
        return goodsInfoPreferPrice;
    }

    /**
     * 销售价
     * @param goodsInfoPreferPrice 销售价
     */
    public void setGoodsInfoPreferPrice(BigDecimal goodsInfoPreferPrice) {
        this.goodsInfoPreferPrice = goodsInfoPreferPrice;
    }

    /**
     * 成本价
     * @return goods_info_cost_price 成本价
     */
    public BigDecimal getGoodsInfoCostPrice() {
        return goodsInfoCostPrice;
    }

    /**
     * 成本价
     * @param goodsInfoCostPrice 成本价
     */
    public void setGoodsInfoCostPrice(BigDecimal goodsInfoCostPrice) {
        this.goodsInfoCostPrice = goodsInfoCostPrice;
    }

    /**
     * 市场价（原价）
     * @return goods_info_market_price 市场价（原价）
     */
    public BigDecimal getGoodsInfoMarketPrice() {
        return goodsInfoMarketPrice;
    }

    /**
     * 市场价（原价）
     * @param goodsInfoMarketPrice 市场价（原价）
     */
    public void setGoodsInfoMarketPrice(BigDecimal goodsInfoMarketPrice) {
        this.goodsInfoMarketPrice = goodsInfoMarketPrice;
    }

    /**
     * 会员价
     * @return goods_info_member_price 会员价
     */
    public Integer getGoodsInfoMemberPrice() {
        return goodsInfoMemberPrice;
    }

    /**
     * 会员价
     * @param goodsInfoMemberPrice 会员价
     */
    public void setGoodsInfoMemberPrice(Integer goodsInfoMemberPrice) {
        this.goodsInfoMemberPrice = goodsInfoMemberPrice;
    }

    /**
     * 0-禁用优惠券，1-可用优惠券
     * @return goods_info_usecoupon 0-禁用优惠券，1-可用优惠券
     */
    public String getGoodsInfoUsecoupon() {
        return goodsInfoUsecoupon;
    }

    /**
     * 0-禁用优惠券，1-可用优惠券
     * @param goodsInfoUsecoupon 0-禁用优惠券，1-可用优惠券
     */
    public void setGoodsInfoUsecoupon(String goodsInfoUsecoupon) {
        this.goodsInfoUsecoupon = goodsInfoUsecoupon == null ? null : goodsInfoUsecoupon.trim();
    }

    /**
     * 创建人ID
     * @return founder_id 创建人ID
     */
    public Long getFounderId() {
        return founderId;
    }

    /**
     * 创建人ID
     * @param founderId 创建人ID
     */
    public void setFounderId(Long founderId) {
        this.founderId = founderId;
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
     * 操作员ID
     * @return operator_id 操作员ID
     */
    public Long getOperatorId() {
        return operatorId;
    }

    /**
     * 操作员ID
     * @param operatorId 操作员ID
     */
    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 删除时间
     * @return delete_time 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 删除时间
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 0-已删除，1-正常，默认为1
     * @return state 0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 0-已删除，1-正常，默认为1
     * @param state 0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}