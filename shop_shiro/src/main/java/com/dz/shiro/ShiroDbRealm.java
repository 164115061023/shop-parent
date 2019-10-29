package com.dz.shiro;

import com.dz.pojo.Permission;
import com.dz.pojo.Role;
import com.dz.pojo.User;
import com.dz.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShiroDbRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String loginName = (String) principalCollection.fromRealm(getName()).iterator().next();
        User user = userService.findByLoginName(loginName);
        if(user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

            List<Role> roleList = user.getRoleList();
            Set<String> roleNameSet = new HashSet<String>();
            for (Role role: roleList) {
                roleNameSet.add(role.getRoleName());
            }
//添加角色(Set集合<字符串>)
            info.setRoles(roleNameSet);
//迭代用户对应的角色集合， 为了获取角色对应的权限
            for(Role role: roleList) {
                List<String> permissionNameList = new ArrayList<String>();
                for(Permission permission : role.getPermissionList()){
                    permissionNameList.add(permission.getPermissionName());
                }
//添加permission
                info.addStringPermissions(permissionNameList);
            }
            return info;
        }
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
            UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
            User user = userService.findByLoginName(token.getUsername());
            if(user != null) {
                return new SimpleAuthenticationInfo(user.getUsername(),
                        user.getPassword(),getName());
            }
            return null;
    }
}
