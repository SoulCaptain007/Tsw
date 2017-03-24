package com.union.tsw.user.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.user.mapper.UserMapper;
import com.union.tsw.user.pojo.User;
import com.union.tsw.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	public UserMapper usermapper;

	@Override
	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return usermapper.insert(record);
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return usermapper.insertSelective(record);
	}

	@Override
	public User selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeUser(User u) {
		// TODO Auto-generated method stub
		
		return usermapper.changeUser(u);
	}
	
	 public List<User> findAll(){
		 
		 return  usermapper.findAll();
	 }

	@Override
	public User findByNameAndPassword(User user) {
		// TODO Auto-generated method stub
		return usermapper.selectByNameAndPassword(user);
	}
	

}
