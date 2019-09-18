package com.sy.mapper;

import com.sy.pojo.Permission;
import com.sy.pojo.Role;
import com.sy.pojo.Userp;
import com.sy.pojo.UserpExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserpMapper {
    int countByExample(UserpExample example);

    int deleteByExample(UserpExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Userp record);

    int insertSelective(Userp record);

    List<Userp> selectByExample(UserpExample example);

    Userp selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Userp record, @Param("example") UserpExample example);

    int updateByExample(@Param("record") Userp record, @Param("example") UserpExample example);

    int updateByPrimaryKeySelective(Userp record);

    int updateByPrimaryKey(Userp record);
    /**
     * 用户角色关联表添加数据
     * @param map uid，rid
     * @return 数据库状态
     */
    int regAddRole(Map<String,Integer> map);

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