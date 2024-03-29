package com.sy.shiro;

import com.sy.pojo.Permission;
import com.sy.pojo.Role;
import com.sy.pojo.Userp;
import com.sy.service.UsersService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UsersService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Object primaryPrincipal = principalCollection.getPrimaryPrincipal();
        if (!StringUtils.isEmpty(primaryPrincipal)){
            String loginName = (String)primaryPrincipal;
            //用户的角色
            Role role = userService.selectRoleByUName(loginName);
            //用户的权限
            List<Permission> tbPermissions = userService.selectPermissionByUName(loginName);
            //权限去重
            Set<String> permissions = new HashSet<>();
            //新的foreach
            tbPermissions.forEach(permission -> permissions.add(permission.getPermissionname()));
            SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
            //给授权信息对象添加当前账户拥有的角色，权限信息
            authorizationInfo.addRole(role.getRoletype());
            authorizationInfo.addStringPermissions(permissions);
            return authorizationInfo;
        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        Object principal = token.getPrincipal();
        if (!StringUtils.isEmpty(principal)){
            String loginName = (String)principal;
            Userp user = userService.findByUName(loginName);
                ByteSource salt = ByteSource.Util.bytes(user.getUname());
                SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUname(), user.getPassword(), salt, getName());
                return authenticationInfo;
        }
        return null;
    }
}
