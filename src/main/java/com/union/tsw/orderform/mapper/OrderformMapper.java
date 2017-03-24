package com.union.tsw.orderform.mapper;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.union.tsw.orderform.pojo.Orderform;

public interface OrderformMapper {
    List<Orderform> selectAllOrderformByUserId(Integer orderformId);

    int removeOrderformById(Orderform orderform);
    
    int submitAllOrderformbyUserId(int userId);
    
    int insertIntoOrderform(Orderform orderform);
    
    public int submitAll(int userId);
}