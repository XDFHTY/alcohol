package com.cjkj.mapper;

import com.cjkj.entity.OrderInfo;

public interface OrderInfoMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long orderInfoId);

    /**
     *
     * @mbggenerated
     */
    int insert(OrderInfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(OrderInfo record);

    /**
     *
     * @mbggenerated
     */
    OrderInfo selectByPrimaryKey(Long orderInfoId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OrderInfo record);
}