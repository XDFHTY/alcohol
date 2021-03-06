package com.cjkj.entity;

import java.math.BigDecimal;

public class OrderInfo {
    /**
     * 订单明细表
     */
    private Long orderInfoId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 货品ID
     */
    private Long goodsInfoId;

    /**
     * 货品名称
     */
    private String goodsInfoName;

    /**
     * 购买价格
     */
    private BigDecimal purchasePrice;

    /**
     * 购买数量
     */
    private Long purchaseNum;

    /**
     * 订单明细表
     * @return order_info_id 订单明细表
     */
    public Long getOrderInfoId() {
        return orderInfoId;
    }

    /**
     * 订单明细表
     * @param orderInfoId 订单明细表
     */
    public void setOrderInfoId(Long orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    /**
     * 订单ID
     * @return order_id 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单编号
     * @return order_code 订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单编号
     * @param orderCode 订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
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
     * 商品名称
     * @return goods_name 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品名称
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
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
     * 购买价格
     * @return purchase_price 购买价格
     */
    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * 购买价格
     * @param purchasePrice 购买价格
     */
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * 购买数量
     * @return purchase_num 购买数量
     */
    public Long getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * 购买数量
     * @param purchaseNum 购买数量
     */
    public void setPurchaseNum(Long purchaseNum) {
        this.purchaseNum = purchaseNum;
    }
}