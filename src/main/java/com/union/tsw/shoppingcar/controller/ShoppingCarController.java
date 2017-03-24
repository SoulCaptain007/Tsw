package com.union.tsw.shoppingcar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.remark.pojo.Remark;
import com.union.tsw.shoppingcar.pojo.ShoppingCar;
import com.union.tsw.shoppingcar.service.ShoppingCarService;

@Controller
public class ShoppingCarController {
	
	@Autowired
	public ShoppingCarService shoppingCarService;
	
	@RequestMapping("/findAllShoppingcar")
	public @ResponseBody List<ShoppingCar> findAllShoppingcar(){
		List<ShoppingCar> shoppingcar=shoppingCarService.findAllShoppingcar();
		return shoppingcar;
		
	}
	@RequestMapping("/deleteByPrimaryKey")
	public String deleteByPrimaryKey(Integer shoppingcarId,Integer userId,HttpServletRequest request){
		
		shoppingCarService.deleteByPrimaryKey(shoppingcarId);
		//List<ShoppingCar> shoppingcar = shoppingCarService.findAllShoppingcar();
		
		//request.setAttribute("record", shoppingcar);
		return "findByIdShoppingcar?userId="+userId;
	}
	
	@RequestMapping("/insert")
	public String insert(ShoppingCar record,HttpServletRequest request){
		shoppingCarService.insert(record);
		
		//List<ShoppingCar> shoppingcar = shoppingCarService.findAllShoppingcar();
		//request.setAttribute("record",shoppingcar);
		return "findByIdShoppingcar?userId="+record.getUserId();
	}
	
	/*@RequestMapping("/updateByPrimaryKeySelective")
	public String updateByPrimaryKeySelective(ShoppingCar record) {
		shoppingCarService.updateByPrimaryKeySelective(record);
		return "index.jsp";
	}*/
}
