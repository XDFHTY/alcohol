package com.cjkj.entity;

import java.math.BigDecimal;

public class UserDetails {
    /**
     * 用户信息扩展表
     */
    private Long id;

    /**
     * 用户ID，user表主键
     */
    private Long userId;

    /**
     * 姓名
     */
    private String userFull;

    /**
     * 性别，1-男，2-女
     */
    private String userSex;

    /**
     * 昵称
     */
    private String userNike;

    /**
     * 头像地址
     */
    private String userHead;

    /**
     * 身份证号码
     */
    private String userCard;

    /**
     * 生日
     */
    private String userBirthday;

    /**
     * 剩余总积分
     */
    private Long userIntegral;

    /**
     * 总余额
     */
    private BigDecimal userBalance;

    /**
     * 支付密码
     */
    private String userPayPass;

    /**
     * 用户信息扩展表
     * @return id 用户信息扩展表
     */
    public Long getId() {
        return id;
    }

    /**
     * 用户信息扩展表
     * @param id 用户信息扩展表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户ID，user表主键
     * @return user_id 用户ID，user表主键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID，user表主键
     * @param userId 用户ID，user表主键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 姓名
     * @return user_full 姓名
     */
    public String getUserFull() {
        return userFull;
    }

    /**
     * 姓名
     * @param userFull 姓名
     */
    public void setUserFull(String userFull) {
        this.userFull = userFull == null ? null : userFull.trim();
    }

    /**
     * 性别，1-男，2-女
     * @return user_sex 性别，1-男，2-女
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 性别，1-男，2-女
     * @param userSex 性别，1-男，2-女
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * 昵称
     * @return user_nike 昵称
     */
    public String getUserNike() {
        return userNike;
    }

    /**
     * 昵称
     * @param userNike 昵称
     */
    public void setUserNike(String userNike) {
        this.userNike = userNike == null ? null : userNike.trim();
    }

    /**
     * 头像地址
     * @return user_head 头像地址
     */
    public String getUserHead() {
        return userHead;
    }

    /**
     * 头像地址
     * @param userHead 头像地址
     */
    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    /**
     * 身份证号码
     * @return user_card 身份证号码
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     * 身份证号码
     * @param userCard 身份证号码
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    /**
     * 生日
     * @return user_birthday 生日
     */
    public String getUserBirthday() {
        return userBirthday;
    }

    /**
     * 生日
     * @param userBirthday 生日
     */
    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }

    /**
     * 剩余总积分
     * @return user_integral 剩余总积分
     */
    public Long getUserIntegral() {
        return userIntegral;
    }

    /**
     * 剩余总积分
     * @param userIntegral 剩余总积分
     */
    public void setUserIntegral(Long userIntegral) {
        this.userIntegral = userIntegral;
    }

    /**
     * 总余额
     * @return user_balance 总余额
     */
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    /**
     * 总余额
     * @param userBalance 总余额
     */
    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    /**
     * 支付密码
     * @return user_pay_pass 支付密码
     */
    public String getUserPayPass() {
        return userPayPass;
    }

    /**
     * 支付密码
     * @param userPayPass 支付密码
     */
    public void setUserPayPass(String userPayPass) {
        this.userPayPass = userPayPass == null ? null : userPayPass.trim();
    }
}