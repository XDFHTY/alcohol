package com.cjkj.entity;

import java.util.Date;

public class SystemImg {
    /**
     * 系统图片表
     */
    private Long systemImgId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 货品ID
     */
    private Long goodsInfoId;

    /**
     * 商品类型ID
     */
    private Long typeId;

    /**
     * 折扣信息表ID
     */
    private Long discountId;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 点击跳转路径
     */
    private String toUrl;

    /**
     * 图片分类，1-首页图片（轮播图是主要图片，只能有4张），2-商品图片（只能有一张主要图片），3-折扣图片（只能有一张主要图片），4-其他图片
     */
    private String pictureType;

    /**
     * 图片类型，1-主要图片（展示在列表项或第一张），2-次要图片
     */
    private String imgType;

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
     * 操作时间
     */
    private Date operateTime;

    /**
     * 状态，0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 系统图片表
     * @return system_img_id 系统图片表
     */
    public Long getSystemImgId() {
        return systemImgId;
    }

    /**
     * 系统图片表
     * @param systemImgId 系统图片表
     */
    public void setSystemImgId(Long systemImgId) {
        this.systemImgId = systemImgId;
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
     * 商品类型ID
     * @return type_id 商品类型ID
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 商品类型ID
     * @param typeId 商品类型ID
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 折扣信息表ID
     * @return discount_id 折扣信息表ID
     */
    public Long getDiscountId() {
        return discountId;
    }

    /**
     * 折扣信息表ID
     * @param discountId 折扣信息表ID
     */
    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    /**
     * 图片路径
     * @return img_url 图片路径
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片路径
     * @param imgUrl 图片路径
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 点击跳转路径
     * @return to_url 点击跳转路径
     */
    public String getToUrl() {
        return toUrl;
    }

    /**
     * 点击跳转路径
     * @param toUrl 点击跳转路径
     */
    public void setToUrl(String toUrl) {
        this.toUrl = toUrl == null ? null : toUrl.trim();
    }

    /**
     * 图片分类，1-首页图片（轮播图是主要图片，只能有4张），2-商品图片（只能有一张主要图片），3-折扣图片（只能有一张主要图片），4-其他图片
     * @return picture_type 图片分类，1-首页图片（轮播图是主要图片，只能有4张），2-商品图片（只能有一张主要图片），3-折扣图片（只能有一张主要图片），4-其他图片
     */
    public String getPictureType() {
        return pictureType;
    }

    /**
     * 图片分类，1-首页图片（轮播图是主要图片，只能有4张），2-商品图片（只能有一张主要图片），3-折扣图片（只能有一张主要图片），4-其他图片
     * @param pictureType 图片分类，1-首页图片（轮播图是主要图片，只能有4张），2-商品图片（只能有一张主要图片），3-折扣图片（只能有一张主要图片），4-其他图片
     */
    public void setPictureType(String pictureType) {
        this.pictureType = pictureType == null ? null : pictureType.trim();
    }

    /**
     * 图片类型，1-主要图片（展示在列表项或第一张），2-次要图片
     * @return img_type 图片类型，1-主要图片（展示在列表项或第一张），2-次要图片
     */
    public String getImgType() {
        return imgType;
    }

    /**
     * 图片类型，1-主要图片（展示在列表项或第一张），2-次要图片
     * @param imgType 图片类型，1-主要图片（展示在列表项或第一张），2-次要图片
     */
    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
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
     * 操作时间
     * @return operate_time 操作时间
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 操作时间
     * @param operateTime 操作时间
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 状态，0-已删除，1-正常，默认为1
     * @return state 状态，0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，0-已删除，1-正常，默认为1
     * @param state 状态，0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}