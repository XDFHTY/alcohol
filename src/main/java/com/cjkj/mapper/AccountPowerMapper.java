package com.cjkj.mapper;

import com.cjkj.entity.AccountPower;

public interface AccountPowerMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer accountPowerId);

    /**
     *
     * @mbggenerated
     */
    int insert(AccountPower record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AccountPower record);

    /**
     *
     * @mbggenerated
     */
    AccountPower selectByPrimaryKey(Integer accountPowerId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccountPower record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccountPower record);
}