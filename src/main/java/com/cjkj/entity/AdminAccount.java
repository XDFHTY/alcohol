package com.cjkj.entity;

import java.util.Date;

public class AdminAccount {
    /**
     * 管理员账户表
     */
    private Long adminAccountId;

    /**
     * 管理员账号
     */
    private String adminAccount;

    /**
     * 管理员密码
     */
    private String adminPass;

    /**
     * 密码安全码
     */
    private String saltVal;

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
    private Date operationTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     */
    private String state;

    /**
     * 管理员账户表
     * @return admin_account_id 管理员账户表
     */
    public Long getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * 管理员账户表
     * @param adminAccountId 管理员账户表
     */
    public void setAdminAccountId(Long adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * 管理员账号
     * @return admin_account 管理员账号
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * 管理员账号
     * @param adminAccount 管理员账号
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    /**
     * 管理员密码
     * @return admin_pass 管理员密码
     */
    public String getAdminPass() {
        return adminPass;
    }

    /**
     * 管理员密码
     * @param adminPass 管理员密码
     */
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
    }

    /**
     * 密码安全码
     * @return salt_val 密码安全码
     */
    public String getSaltVal() {
        return saltVal;
    }

    /**
     * 密码安全码
     * @param saltVal 密码安全码
     */
    public void setSaltVal(String saltVal) {
        this.saltVal = saltVal == null ? null : saltVal.trim();
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
     * @return operation_time 操作时间
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * 操作时间
     * @param operationTime 操作时间
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * 最后更新时间
     * @return update_time 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后更新时间
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     * @return state 状态，1-正常，0-禁用（删除），-1-停用
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     * @param state 状态，1-正常，0-禁用（删除），-1-停用
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}