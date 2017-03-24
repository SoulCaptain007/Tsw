package com.union.tsw.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.union.tsw.user.pojo.User;

public interface UserService {
	int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);
    
    public int changeUser(User u);
    
    public List<User> findAll();
    
    public User findByNameAndPassword(User user);

}
