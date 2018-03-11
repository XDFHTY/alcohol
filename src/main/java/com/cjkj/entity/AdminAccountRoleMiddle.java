package com.cjkj.entity;

public class AdminAccountRoleMiddle {
    /**
     * 管理员-角色-中间表
     */
    private Long accountRoleMiddleId;

    /**
     * 账户ID
     */
    private Long adminAccountId;

    /**
     * 角色ID
     */
    private Long accountRoleId;

    /**
     * 管理员-角色-中间表
     * @return account_role_middle_id 管理员-角色-中间表
     */
    public Long getAccountRoleMiddleId() {
        return accountRoleMiddleId;
    }

    /**
     * 管理员-角色-中间表
     * @param accountRoleMiddleId 管理员-角色-中间表
     */
    public void setAccountRoleMiddleId(Long accountRoleMiddleId) {
        this.accountRoleMiddleId = accountRoleMiddleId;
    }

    /**
     * 账户ID
     * @return admin_account_id 账户ID
     */
    public Long getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * 账户ID
     * @param adminAccountId 账户ID
     */
    public void setAdminAccountId(Long adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * 角色ID
     * @return account_role_id 角色ID
     */
    public Long getAccountRoleId() {
        return accountRoleId;
    }

    /**
     * 角色ID
     * @param accountRoleId 角色ID
     */
    public void setAccountRoleId(Long accountRoleId) {
        this.accountRoleId = accountRoleId;
    }
}