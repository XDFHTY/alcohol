package com.cjkj.entity;

import java.util.Date;

public class IntegralUse {
    /**
     * 积分使用记录表
     */
    private Long integralUseId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 使用积分
     */
    private Long integral;

    /**
     * 使用时间
     */
    private Date createTime;

    /**
     * 积分使用记录表
     * @return integral_use_id 积分使用记录表
     */
    public Long getIntegralUseId() {
        return integralUseId;
    }

    /**
     * 积分使用记录表
     * @param integralUseId 积分使用记录表
     */
    public void setIntegralUseId(Long integralUseId) {
        this.integralUseId = integralUseId;
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
     * 订单ID
     * @return order_id 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 使用积分
     * @return integral 使用积分
     */
    public Long getIntegral() {
        return integral;
    }

    /**
     * 使用积分
     * @param integral 使用积分
     */
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    /**
     * 使用时间
     * @return create_time 使用时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 使用时间
     * @param createTime 使用时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}