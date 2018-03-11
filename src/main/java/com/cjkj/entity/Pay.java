package com.cjkj.entity;

public class Pay {
    /**
     * 支付方式表
     */
    private Long payId;

    /**
     * 支付方式名称
     */
    private String payName;

    /**
     * 支付方式表
     * @return pay_id 支付方式表
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * 支付方式表
     * @param payId 支付方式表
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * 支付方式名称
     * @return pay_name 支付方式名称
     */
    public String getPayName() {
        return payName;
    }

    /**
     * 支付方式名称
     * @param payName 支付方式名称
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }
}