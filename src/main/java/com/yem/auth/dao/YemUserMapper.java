package com.yem.auth.dao;

import com.yem.auth.entity.YemUser;

public interface YemUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(YemUser record);

    int insertSelective(YemUser record);

    YemUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(YemUser record);

    int updateByPrimaryKey(YemUser record);
    


    /**
     * 根据会员名查找会员
     * @param userName 会员名
     * @return 会员
     */
    YemUser findByUserName(String userName);
}