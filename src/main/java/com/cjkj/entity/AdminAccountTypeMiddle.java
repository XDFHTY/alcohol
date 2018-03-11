package com.cjkj.entity;

public class AdminAccountTypeMiddle {
    /**
     * 管理员账户-类型-中间表
     */
    private Long accountTypeMiddle;

    /**
     * 管理员账户ID
     */
    private Long adminAccountId;

    /**
     * 账户类型ID
     */
    private Long accountTypeId;

    /**
     * 管理员账户-类型-中间表
     * @return account_type_middle 管理员账户-类型-中间表
     */
    public Long getAccountTypeMiddle() {
        return accountTypeMiddle;
    }

    /**
     * 管理员账户-类型-中间表
     * @param accountTypeMiddle 管理员账户-类型-中间表
     */
    public void setAccountTypeMiddle(Long accountTypeMiddle) {
        this.accountTypeMiddle = accountTypeMiddle;
    }

    /**
     * 管理员账户ID
     * @return admin_account_id 管理员账户ID
     */
    public Long getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * 管理员账户ID
     * @param adminAccountId 管理员账户ID
     */
    public void setAdminAccountId(Long adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * 账户类型ID
     * @return account_type_id 账户类型ID
     */
    public Long getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * 账户类型ID
     * @param accountTypeId 账户类型ID
     */
    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }
}