package com.cjkj.entity;

public class UserAccountRoleMiddle {
    /**
     * 用户账户-角色中间表
     */
    private Long accountRoleMiddleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 用户账户-角色中间表
     * @return account_role_middle_id 用户账户-角色中间表
     */
    public Long getAccountRoleMiddleId() {
        return accountRoleMiddleId;
    }

    /**
     * 用户账户-角色中间表
     * @param accountRoleMiddleId 用户账户-角色中间表
     */
    public void setAccountRoleMiddleId(Long accountRoleMiddleId) {
        this.accountRoleMiddleId = accountRoleMiddleId;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 角色ID
     * @return role_id 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}