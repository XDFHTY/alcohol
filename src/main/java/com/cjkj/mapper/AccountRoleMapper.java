package com.cjkj.mapper;

import com.cjkj.entity.AccountRole;

public interface AccountRoleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     *
     * @mbggenerated
     */
    int insert(AccountRole record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AccountRole record);

    /**
     *
     * @mbggenerated
     */
    AccountRole selectByPrimaryKey(Integer roleId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AccountRole record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AccountRole record);
}