package com.cjkj.mapper;

import com.cjkj.entity.GoodsCata;

public interface GoodsCataMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long cataId);

    /**
     *
     * @mbggenerated
     */
    int insert(GoodsCata record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GoodsCata record);

    /**
     *
     * @mbggenerated
     */
    GoodsCata selectByPrimaryKey(Long cataId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsCata record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodsCata record);
}