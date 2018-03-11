package com.cjkj.entity;

import java.util.Date;

public class Integral {
    /**
     * 积分表
     */
    private Long integralId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 积分
     */
    private Long integral;

    /**
     * 积分来源，1-购物返积分
     */
    private String obtain;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 积分表
     * @return integral_id 积分表
     */
    public Long getIntegralId() {
        return integralId;
    }

    /**
     * 积分表
     * @param integralId 积分表
     */
    public void setIntegralId(Long integralId) {
        this.integralId = integralId;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 积分
     * @return integral 积分
     */
    public Long getIntegral() {
        return integral;
    }

    /**
     * 积分
     * @param integral 积分
     */
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    /**
     * 积分来源，1-购物返积分
     * @return obtain 积分来源，1-购物返积分
     */
    public String getObtain() {
        return obtain;
    }

    /**
     * 积分来源，1-购物返积分
     * @param obtain 积分来源，1-购物返积分
     */
    public void setObtain(String obtain) {
        this.obtain = obtain == null ? null : obtain.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}