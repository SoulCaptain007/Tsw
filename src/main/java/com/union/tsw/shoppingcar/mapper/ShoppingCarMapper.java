package com.union.tsw.shoppingcar.mapper;

import java.util.List;

import com.union.tsw.shoppingcar.pojo.ShoppingCar;

public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer shoppingcarId);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer shoppingcarId);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);
    
    public List<ShoppingCar> findAllShoppingcar();
}