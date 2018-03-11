package com.cjkj.entity;

import java.util.Date;

public class Discount {
    /**
     * 折扣信息表
     */
    private Long discountId;

    /**
     * 标题
     */
    private String tital;

    /**
     * 内容
     */
    private String content;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 活动开始时间
     */
    private Date startTime;

    /**
     * 活动结束时间
     */
    private Date endTime;

    /**
     * 操作员ID
     */
    private Long adminId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 折扣信息表
     * @return discount_id 折扣信息表
     */
    public Long getDiscountId() {
        return discountId;
    }

    /**
     * 折扣信息表
     * @param discountId 折扣信息表
     */
    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    /**
     * 标题
     * @return tital 标题
     */
    public String getTital() {
        return tital;
    }

    /**
     * 标题
     * @param tital 标题
     */
    public void setTital(String tital) {
        this.tital = tital == null ? null : tital.trim();
    }

    /**
     * 内容
     * @return content 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 详细地址
     * @return address 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 活动开始时间
     * @return start_time 活动开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 活动开始时间
     * @param startTime 活动开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 活动结束时间
     * @return end_time 活动结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 活动结束时间
     * @param endTime 活动结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 操作员ID
     * @return admin_id 操作员ID
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 操作员ID
     * @param adminId 操作员ID
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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