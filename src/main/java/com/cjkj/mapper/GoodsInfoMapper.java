package com.cjkj.mapper;

import com.cjkj.entity.GoodsInfo;

public interface GoodsInfoMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long goodsInfoId);

    /**
     *
     * @mbggenerated
     */
    int insert(GoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    GoodsInfo selectByPrimaryKey(Long goodsInfoId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GoodsInfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodsInfo record);
}