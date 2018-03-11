package com.cjkj.entity;

import java.util.Date;

public class AccountRole {
    /**
     * 账户角色表
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色分类，1-管理员，2-用户
     */
    private String type;

    /**
     * 状态（1-正常，0-已删除）
     */
    private String state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 账户角色表
     * @return role_id 账户角色表
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 账户角色表
     * @param roleId 账户角色表
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色分类，1-管理员，2-用户
     * @return type 角色分类，1-管理员，2-用户
     */
    public String getType() {
        return type;
    }

    /**
     * 角色分类，1-管理员，2-用户
     * @param type 角色分类，1-管理员，2-用户
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 状态（1-正常，0-已删除）
     * @return state 状态（1-正常，0-已删除）
     */
    public String getState() {
        return state;
    }

    /**
     * 状态（1-正常，0-已删除）
     * @param state 状态（1-正常，0-已删除）
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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