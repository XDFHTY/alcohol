package com.cjkj.mapper;

import com.cjkj.entity.UserAccountRoleMiddle;

public interface UserAccountRoleMiddleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long accountRoleMiddleId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    UserAccountRoleMiddle selectByPrimaryKey(Long accountRoleMiddleId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserAccountRoleMiddle record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserAccountRoleMiddle record);
}