package com.cjkj.mapper;

import com.cjkj.entity.SystemImg;

public interface SystemImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long systemImgId);

    /**
     *
     * @mbggenerated
     */
    int insert(SystemImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SystemImg record);

    /**
     *
     * @mbggenerated
     */
    SystemImg selectByPrimaryKey(Long systemImgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SystemImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SystemImg record);
}