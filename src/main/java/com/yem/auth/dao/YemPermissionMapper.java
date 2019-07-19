package com.yem.auth.dao;

import java.util.List;

import com.yem.auth.entity.YemPermission;

public interface YemPermissionMapper {
	
    int deleteByPrimaryKey(String permissionId);

    int insert(YemPermission record);

    int insertSelective(YemPermission record);

    YemPermission selectByPrimaryKey(String permissionId);

    int updateByPrimaryKeySelective(YemPermission record);

    int updateByPrimaryKey(YemPermission record);
    
    /**
     * 根据角色id查找权限列表
     * @param roleId 角色id
     * @return 权限列表
     */
    List<YemPermission> findByRoleCode(Long roleCode);
}