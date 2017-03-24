package com.union.tsw.findShoppingcar.service;

import java.util.List;

import com.union.tsw.findShoppingcar.pojo.FindShoppingcar;

public interface FindShoppingcarService {
	
	public List<FindShoppingcar> findByIdShoppingcar(FindShoppingcar find);
	
	public List<FindShoppingcar> findAll();
	
	public int deleteShoppingcar(FindShoppingcar fd);

}
