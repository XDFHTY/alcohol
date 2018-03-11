package com.cjkj.mapper;

import com.cjkj.entity.UserDetails;

public interface UserDetailsMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(UserDetails record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserDetails record);

    /**
     *
     * @mbggenerated
     */
    UserDetails selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserDetails record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserDetails record);
}