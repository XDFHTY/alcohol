package com.cjkj.mapper;

import com.cjkj.entity.AdminAccount;

public interface AdminAccountMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long adminAccountId);

    /**
     *
     * @mbggenerated
     */
    int insert(AdminAccount record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AdminAccount record);

    /**
     *
     * @mbggenerated
     */
    AdminAccount selectByPrimaryKey(Long adminAccountId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminAccount record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminAccount record);
}