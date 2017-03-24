package com.union.tsw.findShoppingcar.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.findShoppingcar.mapper.FindShoppingcarMapper;
import com.union.tsw.findShoppingcar.pojo.FindShoppingcar;
import com.union.tsw.findShoppingcar.service.FindShoppingcarService;

@Service("findShoppingcarService")
public class FindShoppingcarServiceImpl implements FindShoppingcarService{
	
	@Autowired
	public FindShoppingcarMapper findShoppingcarMapper;

	@Override
	public List<FindShoppingcar> findAll() {
		// TODO Auto-generated method stub
		return findShoppingcarMapper.findAll();
	}

	@Override
	public List<FindShoppingcar> findByIdShoppingcar(FindShoppingcar find) {
		// TODO Auto-generated method stub
		return findShoppingcarMapper.findByIdShoppingcar(find);
	}

	@Override
	public int deleteShoppingcar(FindShoppingcar fd) {
		// TODO Auto-generated method stub
		return findShoppingcarMapper.deleteShoppingcar(fd);
	}
	

}
