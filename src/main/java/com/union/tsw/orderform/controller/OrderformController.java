package com.union.tsw.orderform.controller;


import java.util.Date;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.union.tsw.book.service.BookService;
import com.union.tsw.orderform.pojo.Orderdetails;
import com.union.tsw.orderform.pojo.Orderform;
import com.union.tsw.orderform.service.OrderdetailsService;
import com.union.tsw.orderform.service.OrderformService;
import com.union.tsw.shoppingcar.pojo.ShoppingCar;
import com.union.tsw.shoppingcar.service.ShoppingCarService;
import com.union.tsw.user.service.UserService;

@Controller
public class OrderformController {
	@Autowired
	public OrderformService orderformService;
	@Autowired
	public OrderdetailsService orderdetailsService;
	@Autowired
	public ShoppingCarService shoppingCarService;
	
//	@RequestMapping("/insertIntoOrderdetails")
//	 public String insertIntoOrderdetails(Orderdetails orderdetails){
//		orderdetailsService.insertIntoOrderdetails(orderdetails);
//		return "orderform.jsp";
//	 }
	@RequestMapping("/findAllOrderformByUserId")
	public String findAllOrderformByUserId(int userId,HttpServletRequest request) {
		List<Orderform> orderform2 = null;
		orderform2 = orderformService.findAllOrderformByUserId(userId);
		HttpSession session = request.getSession();
		session.setAttribute("orderform", orderform2);
		return orderform2 != null ? "orderform.jsp":"index.jsp";
	}
	
	@RequestMapping("/removeOrderformById")
	public String removeOrderformById(Orderform orderform,HttpServletRequest request) {
		orderformService.removeOrderformById(orderform);
		return "collection.jsp";
	}
	
	@RequestMapping("/submitAllOrderformbyUserId")
	@Transactional(rollbackFor=Exception.class)
	public String submitAllOrderformbyUserId(HttpServletRequest request) {
//		orderformService.submitAllOrderformbyUserId(userId);
		//1.得到所有的选中的订单
		String[] shoppingCarIds = request.getParameterValues("chooseItem");
		Integer userId=1;
		//2.修改shoppingCar的提交过来订单的状态
		for(int i=0;i<shoppingCarIds.length;i++){
			//System.out.println("shoppingCarId:"+shoppingCarIds[0]);
			ShoppingCar sc = shoppingCarService.selectByPrimaryKey(Integer.parseInt(shoppingCarIds[i]));
			System.out.println("UserId="+sc.getUserId());
			userId = sc.getUserId();
			sc.setShoppingcarState(0);
			shoppingCarService.updateByPrimaryKeySelective(sc);
		}
		
		//3.插入一条订单表中
		Orderform of = new Orderform();
		of.setOrderformDate(new Date());
		of.setUserId(userId);
		orderformService.insertIntoOrderform(of);
		int ofId = of.getOrderformId();
		
		
		
		//4.插入数据给orderdetails
		for(int i=0;i<shoppingCarIds.length;i++){
			ShoppingCar sc = shoppingCarService.selectByPrimaryKey(Integer.parseInt(shoppingCarIds[0]));
			userId = sc.getUserId();
			Orderdetails od = new Orderdetails();
			od.setOrderdetailsCount(sc.getShoppingcarCount());
			od.setOrderformId(ofId);
			od.setBookId(sc.getBookId());
			orderdetailsService.insertIntoOrderdetails(od);
		}
		return "findAllOrderformByUserId?userId="+userId;
	}
	
	@RequestMapping("/submitAll")
	public String submitAll(int userId) {
		orderformService.submitAll(userId);
		return "pay.jsp";
	}
	
//	@RequestMapping("/insertIntoOrderform")
//	public String insertIntoOrderform(Orderform orderform,HttpServletRequest request) {
//		orderformService.insertIntoOrderform(orderform);
//		return "orderform.jsp";
//	}
}
