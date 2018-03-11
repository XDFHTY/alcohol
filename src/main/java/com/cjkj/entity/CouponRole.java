package com.cjkj.entity;

public class CouponRole {
    /**
     * 优惠券分类-用户角色关联表，指定此优惠券哪些用户可用
     */
    private Long couponRole;

    /**
     * 优惠券分类ID
     */
    private Long couponCateId;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 优惠券分类-用户角色关联表，指定此优惠券哪些用户可用
     * @return coupon_role 优惠券分类-用户角色关联表，指定此优惠券哪些用户可用
     */
    public Long getCouponRole() {
        return couponRole;
    }

    /**
     * 优惠券分类-用户角色关联表，指定此优惠券哪些用户可用
     * @param couponRole 优惠券分类-用户角色关联表，指定此优惠券哪些用户可用
     */
    public void setCouponRole(Long couponRole) {
        this.couponRole = couponRole;
    }

    /**
     * 优惠券分类ID
     * @return coupon_cate_id 优惠券分类ID
     */
    public Long getCouponCateId() {
        return couponCateId;
    }

    /**
     * 优惠券分类ID
     * @param couponCateId 优惠券分类ID
     */
    public void setCouponCateId(Long couponCateId) {
        this.couponCateId = couponCateId;
    }

    /**
     * 角色ID
     * @return role_id 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}