package com.union.tsw.findShoppingcar.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.findShoppingcar.pojo.FindShoppingcar;
import com.union.tsw.findShoppingcar.service.FindShoppingcarService;

@Controller
public class FindShoppingcarController {
	
	@Autowired
	public FindShoppingcarService findShoppingcarService;
	
	@RequestMapping("/finds")
	public @ResponseBody List<FindShoppingcar> findAll(HttpServletRequest request){
		List<FindShoppingcar> findshoppingcar=findShoppingcarService.findAll();
		
		request.setAttribute("find", findshoppingcar);
		return findshoppingcar;
	}
	
	@RequestMapping("/findByIdShoppingcar")
	public String findByIdShoppingcar(FindShoppingcar find,HttpServletRequest request) {
		List<FindShoppingcar> f = null;
		//System.out.println("”√ªß£∫"+find.getUserId());
		f = findShoppingcarService.findByIdShoppingcar(find);
		//System.out.println(f);
		request.setAttribute("find", f);

		return f != null ? "shoppingCar.jsp":"error.jsp";
	}

	/*@RequestMapping("/findByIdShoppingcar")
	public List<FindShoppingcar> findByIdShoppingcar(FindShoppingcar find,HttpServletRequest request) {
		findShoppingcarService.findByIdShoppingcar(find);
		List<FindShoppingcar> finds=findShoppingcarService.findAll();
		request.setAttribute("find", finds);		
		return finds;
	}*/
	
	public String deleteShoppingcar(FindShoppingcar fd) {
		int f=findShoppingcarService.deleteShoppingcar(fd);
		return f!=0 ? "shoppingCar.jsp":"error.jsp";
	}
	
	

}
