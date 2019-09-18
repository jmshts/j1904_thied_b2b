package com.sy.service.Impl;


import com.sy.mapper.UserpMapper;
import com.sy.pojo.Permission;
import com.sy.pojo.Role;
import com.sy.pojo.Userp;
import com.sy.pojo.UserpExample;
import com.sy.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hx on 2019/9/16 20:29
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserpMapper userMapper;

    /**
     * 注册时校验账号是否存在
     * @param uname 当前输入账号
     * @return 存在true不存在false
     */
    @Override
    public boolean checkUName(String uname) {
        UserpExample example = new UserpExample();
        UserpExample.Criteria criteria = example.createCriteria();
        criteria.andUnameEqualTo(uname);
        List<Userp> users = userMapper.selectByExample(example);
        if (users.size()==0){
            return false;
        }
        return true;
    }

    /**
     * 注册（会员）
     * @param user 提交的信息（账号密码注册时间）
     * @return 是否成功
     */
    @Override
    public boolean logon(Userp user) {
        int i = userMapper.insertSelective(user);
        return i>0;
    }

    /**
     * 根据账号动态更新用户信息（最后登录时间，登录次数）
     * @param user 用户信息
     * @return 是否更新成功
     */
    @Override
    public boolean updateLoginTime(Userp user) {
        UserpExample userpExample = new UserpExample();
        UserpExample.Criteria criteria = userpExample.createCriteria();
        criteria.andUnameEqualTo(user.getUname());
        int i = userMapper.updateByExampleSelective(user, userpExample);
        return i>0;
    }

    /**
     * 根据账户查询用户信息
     * @param uname 账号
     * @return 用户信息
     */
    @Override
    public Userp findByUName(String uname) {
        UserpExample usersExample = new UserpExample();
        UserpExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUnameEqualTo(uname);
        List<Userp> users = userMapper.selectByExample(usersExample);
        return users.get(0);
    }

    /**
     * 根据id查用户
     * @param uid 用户id
     * @return 用户对象
     */
    @Override
    public Userp findById(int uid) {
        Userp userp = userMapper.selectByPrimaryKey(uid);
        return userp;
    }

    /**
     * 注册时添加角色信息
     * @param uid 用户id
     * @param rid 角色id
     * @return 是否成功
     */
    @Override
    public boolean regAddRole(int uid, int rid) {
        Map<String,Integer> map = new HashMap<>();
        map.put("uid",uid);
        map.put("rid",rid);
        int i = userMapper.regAddRole(map);
        return i>0;
    }

    /**
     * 根据账号查询角色信息
     * @param uname 账号
     * @return 用户拥有的角色信息
     */
    @Override
    public Role selectRoleByUName(String uname) {
        Role role = userMapper.selectRoleByUName(uname);
        return role;
    }

    /**
     * 根据账号查询权限信息
     * @param uname 账号
     * @return 用户拥有的权限信息
     */
    @Override
    public List<Permission> selectPermissionByUName(String uname) {
        List<Permission> permissions = userMapper.selectPermissionByUName(uname);
        return permissions;
    }
}
