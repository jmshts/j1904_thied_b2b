package com.sy.service;


import com.sy.pojo.Permission;
import com.sy.pojo.Role;
import com.sy.pojo.Userp;

import java.util.List;

/**
 * Created by hx on 2019/9/16 20:29
 */
public interface UsersService {

    /**
     * 注册时校验账号是否存在
     * @param uname 当前输入账号
     * @return 存在true不存在false
     */
    boolean checkUName(String uname);

    /**
     * 注册（会员）
     * @param user 提交的信息（账号密码注册时间）
     * @return 是否成功
     */
    boolean logon(Userp user);

    /**
     * 根据账号动态更新用户信息（最后登录时间，登录次数）
     * @param user 用户信息
     * @return 是否更新成功
     */
    boolean updateLoginTime(Userp user);

    /**
     * 根据账户查询用户信息
     * @param uname 账号
     * @return 用户信息
     *
     */
    Userp findByUName(String uname);

    /**
     * 根据id查用户
     * @param uid 用户id
     * @return 用户对象
     */
    Userp findById(int uid);

    /**
     * 注册时添加角色信息
     * @param uid 用户id
     * @param rid 角色id
     * @return 是否成功
     */
    boolean regAddRole(int uid,int rid);

    /**
     * 根据账号查询角色信息
     * @param uname 账号
     * @return 用户拥有的角色信息
     */
    Role selectRoleByUName(String uname);

    /**
     * 根据账号查询权限信息
     * @param uname 账号
     * @return 用户拥有的权限信息
     */
    List<Permission> selectPermissionByUName(String uname);
}
