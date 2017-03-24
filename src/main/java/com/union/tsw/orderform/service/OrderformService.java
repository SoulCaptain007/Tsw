package com.union.tsw.orderform.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.union.tsw.orderform.pojo.Orderdetails;
import com.union.tsw.orderform.pojo.Orderform;

public interface OrderformService {
	
	public List<Orderform> findAllOrderformByUserId(Integer orderformId);
	
	public int removeOrderformById(Orderform orderform);
	
	public int submitAllOrderformbyUserId(int userId);
	
	public int insertIntoOrderform(Orderform orderform);
	
	public int submitAll(int userId);
	
}