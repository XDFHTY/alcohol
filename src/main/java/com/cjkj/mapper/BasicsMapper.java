package com.cjkj.mapper;

import com.cjkj.entity.Basics;

public interface BasicsMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long basicsId);

    /**
     *
     * @mbggenerated
     */
    int insert(Basics record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Basics record);

    /**
     *
     * @mbggenerated
     */
    Basics selectByPrimaryKey(Long basicsId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Basics record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Basics record);
}