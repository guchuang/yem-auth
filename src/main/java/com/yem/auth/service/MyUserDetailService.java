package com.yem.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yem.auth.dao.YemPermissionMapper;
import com.yem.auth.dao.YemRoleMapper;
import com.yem.auth.dao.YemUserMapper;
import com.yem.auth.entity.YemPermission;
import com.yem.auth.entity.YemRole;
import com.yem.auth.entity.YemUser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *〈自定义UserDetailService〉
 * 自定义认证逻辑
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2019年7月23日 上午9:58:32 <br/>
 *
 * @author <a href="mailto:hbszguchuang@163.com">guchuang</a>
 * @version 
 * @since JDK 1.8
 */
@Service//("userDetailService")
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private YemUserMapper yemUserMapper;

    @Autowired
    private YemRoleMapper yemRoleMapper;

    @Autowired
    private YemPermissionMapper yemPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String memberName) throws UsernameNotFoundException {
        YemUser member = yemUserMapper.findByUserName(memberName);
        if (member == null) {
            throw new UsernameNotFoundException(memberName);
        }
        List<YemRole> roles = yemRoleMapper.findByUserCode(member.getUserCode());
        if (roles == null || roles.isEmpty()) {
            throw new UsernameNotFoundException(memberName);
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        // 可用性 :true:可用 false:不可用
        boolean enabled = true;
        // 过期性 :true:没过期 false:过期
        boolean accountNonExpired = true;
        // 有效性 :true:凭证有效 false:凭证无效
        boolean credentialsNonExpired = true;
        // 锁定性 :true:未锁定 false:已锁定
        boolean accountNonLocked = true;
        for (YemRole role : roles) {
            //角色必须是ROLE_开头，可以在数据库中设置
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRoleName());
            grantedAuthorities.add(grantedAuthority);
            List<YemPermission> permissions = yemPermissionMapper.findByRoleCode(role.getRoleCode());
            if (permissions == null || permissions.isEmpty()) {
                throw new UsernameNotFoundException(memberName);
            }
            //获取权限
            for (YemPermission permission : permissions) {
                GrantedAuthority authority = new SimpleGrantedAuthority(permission.getUri());
                grantedAuthorities.add(authority);
            }
        }
        User user = new User(member.getUserName(), member.getPassword(),
                enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);
        return user;
    }

}

