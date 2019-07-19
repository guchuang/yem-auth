package com.yem.auth.dao;

import java.util.List;

import com.yem.auth.entity.YemRole;

public interface YemRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(YemRole record);

    int insertSelective(YemRole record);

    YemRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(YemRole record);

    int updateByPrimaryKey(YemRole record);
    
    /**
     * 根据用户id查找角色列表
     * @param memberId 用户id
     * @return 角色列表
     */
    List<YemRole> findByUserCode(Long userCode);
}