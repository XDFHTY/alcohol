package com.cjkj.mapper;

import com.cjkj.entity.AdminAccountRoleMiddle;

public interface AdminAccountRoleMiddleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long accountRoleMiddleId);

    /**
     *
     * @mbggenerated
     */
    int insert(AdminAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AdminAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    AdminAccountRoleMiddle selectByPrimaryKey(Long accountRoleMiddleId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminAccountRoleMiddle record);
}