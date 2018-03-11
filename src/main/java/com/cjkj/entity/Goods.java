package com.cjkj.entity;

import java.util.Date;

public class Goods {
    /**
     * 商品表
     */
    private Long goodsId;

    /**
     * 商品分类ID
     */
    private Long catId;

    /**
     * 类型ID
     */
    private Long typeId;

    /**
     * 商品标题
     */
    private String goodsName;

    /**
     * 商品副标题
     */
    private String goodsSubtitle;

    /**
     * 商品编号
     */
    private String goodsNo;

    /**
     * 商品品牌
     */
    private String brandId;

    /**
     * 商品简介
     */
    private String goodsBrief;

    /**
     * 0-下架，1-上架，默认下架，商品上下架，其下货品全部保持一致
     */
    private String goodsAdded;

    /**
     * 更新时间
     */
    private Date goodsUptime;

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
     * 商品表
     * @return goods_id 商品表
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 商品表
     * @param goodsId 商品表
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品分类ID
     * @return cat_id 商品分类ID
     */
    public Long getCatId() {
        return catId;
    }

    /**
     * 商品分类ID
     * @param catId 商品分类ID
     */
    public void setCatId(Long catId) {
        this.catId = catId;
    }

    /**
     * 类型ID
     * @return type_id 类型ID
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 类型ID
     * @param typeId 类型ID
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 商品标题
     * @return goods_name 商品标题
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 商品标题
     * @param goodsName 商品标题
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * 商品副标题
     * @return goods_subtitle 商品副标题
     */
    public String getGoodsSubtitle() {
        return goodsSubtitle;
    }

    /**
     * 商品副标题
     * @param goodsSubtitle 商品副标题
     */
    public void setGoodsSubtitle(String goodsSubtitle) {
        this.goodsSubtitle = goodsSubtitle == null ? null : goodsSubtitle.trim();
    }

    /**
     * 商品编号
     * @return goods_no 商品编号
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 商品编号
     * @param goodsNo 商品编号
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    /**
     * 商品品牌
     * @return brand_id 商品品牌
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * 商品品牌
     * @param brandId 商品品牌
     */
    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    /**
     * 商品简介
     * @return goods_brief 商品简介
     */
    public String getGoodsBrief() {
        return goodsBrief;
    }

    /**
     * 商品简介
     * @param goodsBrief 商品简介
     */
    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    /**
     * 0-下架，1-上架，默认下架，商品上下架，其下货品全部保持一致
     * @return goods_added 0-下架，1-上架，默认下架，商品上下架，其下货品全部保持一致
     */
    public String getGoodsAdded() {
        return goodsAdded;
    }

    /**
     * 0-下架，1-上架，默认下架，商品上下架，其下货品全部保持一致
     * @param goodsAdded 0-下架，1-上架，默认下架，商品上下架，其下货品全部保持一致
     */
    public void setGoodsAdded(String goodsAdded) {
        this.goodsAdded = goodsAdded == null ? null : goodsAdded.trim();
    }

    /**
     * 更新时间
     * @return goods_uptime 更新时间
     */
    public Date getGoodsUptime() {
        return goodsUptime;
    }

    /**
     * 更新时间
     * @param goodsUptime 更新时间
     */
    public void setGoodsUptime(Date goodsUptime) {
        this.goodsUptime = goodsUptime;
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