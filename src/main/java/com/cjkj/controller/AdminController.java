package com.cjkj.controller;


import com.cjkj.entity.AdminAccount;
import org.springframework.stereotype.Controller;

/**
 *管理员相关基础业务
 */
@Controller
public class AdminController {


    /**
     * 管理员登录
     * 参数：账号、密码
     * 返回：成功、失败
     */
    public void ifLogin(AdminAccount adminAccount){

    }


    /**
     * 管理员注销
     * 参数：无
     * 业务：销毁session
     * 返回：成功、失败
     */
    public void ifLogout(){

    }

    /**
     * 管理员修改密码，修改成功要求重新登录
     * 参数：原密码、新密码等
     * 业务：校验密码、修改密码、销毁session
     * 返回：修改成功、失败
     */
    public void updatePass(){

    }

}
