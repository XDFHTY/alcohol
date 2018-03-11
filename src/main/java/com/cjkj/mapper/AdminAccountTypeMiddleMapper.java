package com.cjkj.mapper;

import com.cjkj.entity.AdminAccountTypeMiddle;

public interface AdminAccountTypeMiddleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long accountTypeMiddle);

    /**
     *
     * @mbggenerated
     */
    int insert(AdminAccountTypeMiddle record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AdminAccountTypeMiddle record);

    /**
     *
     * @mbggenerated
     */
    AdminAccountTypeMiddle selectByPrimaryKey(Long accountTypeMiddle);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminAccountTypeMiddle record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminAccountTypeMiddle record);
}