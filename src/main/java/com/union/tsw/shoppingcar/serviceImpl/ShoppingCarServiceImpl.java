package com.union.tsw.shoppingcar.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.shoppingcar.mapper.ShoppingCarMapper;
import com.union.tsw.shoppingcar.pojo.ShoppingCar;
import com.union.tsw.shoppingcar.service.ShoppingCarService;

@Service("shoppingCarService")
public class ShoppingCarServiceImpl implements ShoppingCarService{
	
	@Autowired
	public ShoppingCarMapper shoppingcarmapper;

	@Override
	public int deleteByPrimaryKey(Integer shoppingcarId) {
		// TODO Auto-generated method stub
		return shoppingcarmapper.deleteByPrimaryKey(shoppingcarId);
	}

	@Override
	public int insert(ShoppingCar record) {
		// TODO Auto-generated method stub
		return shoppingcarmapper.insert(record);
	}

	@Override
	public int insertSelective(ShoppingCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ShoppingCar selectByPrimaryKey(Integer shoppingcarId) {
		// TODO Auto-generated method stub
		return shoppingcarmapper.selectByPrimaryKey(shoppingcarId);
	}

	@Override
	public int updateByPrimaryKeySelective(ShoppingCar record) {
		// TODO Auto-generated method stub
		return shoppingcarmapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ShoppingCar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ShoppingCar> findAllShoppingcar() {
		// TODO Auto-generated method stub
		return shoppingcarmapper.findAllShoppingcar();
	}
	

}
