package com.cjkj.mapper;

import com.cjkj.entity.Goods;

public interface GoodsMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long goodsId);

    /**
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Goods record);

    /**
     *
     * @mbggenerated
     */
    Goods selectByPrimaryKey(Long goodsId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);
}