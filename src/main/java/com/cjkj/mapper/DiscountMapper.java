package com.cjkj.mapper;

import com.cjkj.entity.Discount;

public interface DiscountMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long discountId);

    /**
     *
     * @mbggenerated
     */
    int insert(Discount record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Discount record);

    /**
     *
     * @mbggenerated
     */
    Discount selectByPrimaryKey(Long discountId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Discount record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Discount record);
}