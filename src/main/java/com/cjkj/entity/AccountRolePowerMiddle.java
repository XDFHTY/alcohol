package com.cjkj.entity;

public class AccountRolePowerMiddle {
    /**
     * 账户角色-权限资源-中间表
     */
    private Integer rolePowerMiddleId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限资源id
     */
    private Integer powerId;

    /**
     * 账户角色-权限资源-中间表
     * @return role_power_middle_id 账户角色-权限资源-中间表
     */
    public Integer getRolePowerMiddleId() {
        return rolePowerMiddleId;
    }

    /**
     * 账户角色-权限资源-中间表
     * @param rolePowerMiddleId 账户角色-权限资源-中间表
     */
    public void setRolePowerMiddleId(Integer rolePowerMiddleId) {
        this.rolePowerMiddleId = rolePowerMiddleId;
    }

    /**
     * 角色id
     * @return role_id 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 权限资源id
     * @return power_id 权限资源id
     */
    public Integer getPowerId() {
        return powerId;
    }

    /**
     * 权限资源id
     * @param powerId 权限资源id
     */
    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }
}