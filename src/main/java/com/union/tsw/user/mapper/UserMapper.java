package com.union.tsw.user.mapper;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.union.tsw.user.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
    
    public int changeUser(User u);
    
    public List<User> findAll();
    
    User selectByNameAndPassword(User user);
}