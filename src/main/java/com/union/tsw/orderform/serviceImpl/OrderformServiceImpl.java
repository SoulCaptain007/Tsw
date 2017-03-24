package com.union.tsw.orderform.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.orderform.mapper.OrderformMapper;
import com.union.tsw.orderform.pojo.Orderdetails;
import com.union.tsw.orderform.pojo.Orderform;
import com.union.tsw.orderform.service.OrderformService;

@Service("orderformService")
public class OrderformServiceImpl implements OrderformService {
	@Autowired
	public OrderformMapper orderformMapper;

	@Override
	public List<Orderform> findAllOrderformByUserId(Integer orderformId){
		return orderformMapper.selectAllOrderformByUserId(orderformId);
	}

	@Override
	public int removeOrderformById(Orderform orderform) {
		return orderformMapper.removeOrderformById(orderform);
	}

	@Override
	public int submitAllOrderformbyUserId(int userId) {
		return orderformMapper.submitAllOrderformbyUserId(userId);
	}

	@Override
	public int insertIntoOrderform(Orderform orderform) {
		return orderformMapper.insertIntoOrderform(orderform);
	}

	@Override
	public int submitAll(int userId) {
		// TODO Auto-generated method stub
		return orderformMapper.submitAll(userId);
	}

}
