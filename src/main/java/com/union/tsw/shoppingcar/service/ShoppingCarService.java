package com.union.tsw.shoppingcar.service;

import java.util.List;

import com.union.tsw.shoppingcar.pojo.ShoppingCar;

public interface ShoppingCarService {
    int deleteByPrimaryKey(Integer shoppingcarId);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer shoppingcarId);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);
    
    public List<ShoppingCar> findAllShoppingcar();

}
