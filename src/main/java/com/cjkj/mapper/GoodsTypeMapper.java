package com.cjkj.mapper;

import com.cjkj.entity.GoodsType;

public interface GoodsTypeMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long typeId);

    /**
     *
     * @mbggenerated
     */
    int insert(GoodsType record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GoodsType record);

    /**
     *
     * @mbggenerated
     */
    GoodsType selectByPrimaryKey(Long typeId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsType record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodsType record);
}