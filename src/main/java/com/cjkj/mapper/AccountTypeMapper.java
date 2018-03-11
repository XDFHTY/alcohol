package com.cjkj.mapper;

import com.cjkj.entity.AccountType;

public interface AccountTypeMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long accountTypeId);

    /**
     *
     * @mbggenerated
     */
    int insert(AccountType record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AccountType record);

    /**
     *
     * @mbggenerated
     */
    AccountType selectByPrimaryKey(Long accountTypeId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccountType record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccountType record);
}