package com.union.tsw.orderform.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.orderform.mapper.OrderdetailsMapper;
import com.union.tsw.orderform.pojo.Orderdetails;
import com.union.tsw.orderform.service.OrderdetailsService;

@Service("orderdetailsService")
public class OrderdetailsServiceImpl implements OrderdetailsService{
	@Autowired
	public OrderdetailsMapper orderdetailsMapper;

	@Override
	public int insertIntoOrderdetails(Orderdetails orderdetails) {
		// TODO Auto-generated method stub
		return orderdetailsMapper.insertIntoOrderdetails(orderdetails);
	}

}
