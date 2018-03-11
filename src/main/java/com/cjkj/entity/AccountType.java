package com.cjkj.entity;

public class AccountType {
    /**
     * 账户类型表
     */
    private Long accountTypeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 账户类型表
     * @return account_type_id 账户类型表
     */
    public Long getAccountTypeId() {
        return accountTypeId;
    }

    /**
     * 账户类型表
     * @param accountTypeId 账户类型表
     */
    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    /**
     * 类型名称
     * @return type_name 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 类型名称
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}