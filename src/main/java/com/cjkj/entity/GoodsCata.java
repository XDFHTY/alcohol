package com.cjkj.entity;

import java.util.Date;

public class GoodsCata {
    /**
     * 商品分类ID
     */
    private Long cataId;

    /**
     * 商品名称
     */
    private String catName;

    /**
     * 父类ID
     */
    private Long catParentId;

    /**
     * 商品类型ID
     */
    private Long typeId;

    /**
     * 1-一级分类，2-二级分类，3-三级分类
     */
    private String catGrade;

    /**
     * 创建者ID
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
     * 0-已删除，1-正常
     */
    private String state;

    /**
     * 商品分类ID
     * @return cata_id 商品分类ID
     */
    public Long getCataId() {
        return cataId;
    }

    /**
     * 商品分类ID
     * @param cataId 商品分类ID
     */
    public void setCataId(Long cataId) {
        this.cataId = cataId;
    }

    /**
     * 商品名称
     * @return cat_name 商品名称
     */
    public String getCatName() {
        return catName;
    }

    /**
     * 商品名称
     * @param catName 商品名称
     */
    public void setCatName(String catName) {
        this.catName = catName == null ? null : catName.trim();
    }

    /**
     * 父类ID
     * @return cat_parent_id 父类ID
     */
    public Long getCatParentId() {
        return catParentId;
    }

    /**
     * 父类ID
     * @param catParentId 父类ID
     */
    public void setCatParentId(Long catParentId) {
        this.catParentId = catParentId;
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
     * 1-一级分类，2-二级分类，3-三级分类
     * @return cat_grade 1-一级分类，2-二级分类，3-三级分类
     */
    public String getCatGrade() {
        return catGrade;
    }

    /**
     * 1-一级分类，2-二级分类，3-三级分类
     * @param catGrade 1-一级分类，2-二级分类，3-三级分类
     */
    public void setCatGrade(String catGrade) {
        this.catGrade = catGrade == null ? null : catGrade.trim();
    }

    /**
     * 创建者ID
     * @return founder_id 创建者ID
     */
    public Long getFounderId() {
        return founderId;
    }

    /**
     * 创建者ID
     * @param founderId 创建者ID
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
     * 0-已删除，1-正常
     * @return state 0-已删除，1-正常
     */
    public String getState() {
        return state;
    }

    /**
     * 0-已删除，1-正常
     * @param state 0-已删除，1-正常
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}