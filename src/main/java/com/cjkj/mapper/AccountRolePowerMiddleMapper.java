package com.cjkj.mapper;

import com.cjkj.entity.AccountRolePowerMiddle;

public interface AccountRolePowerMiddleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer rolePowerMiddleId);

    /**
     *
     * @mbggenerated
     */
    int insert(AccountRolePowerMiddle record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AccountRolePowerMiddle record);

    /**
     *
     * @mbggenerated
     */
    AccountRolePowerMiddle selectByPrimaryKey(Integer rolePowerMiddleId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccountRolePowerMiddle record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccountRolePowerMiddle record);
}