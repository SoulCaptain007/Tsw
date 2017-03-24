package com.union.tsw.findShoppingcar.mapper;

import java.util.List;

import com.union.tsw.findShoppingcar.pojo.FindShoppingcar;

public interface FindShoppingcarMapper {
	
	public List<FindShoppingcar> findByIdShoppingcar(FindShoppingcar find);
	
	public List<FindShoppingcar> findAll();
	
	public int deleteShoppingcar(FindShoppingcar fd);

}
