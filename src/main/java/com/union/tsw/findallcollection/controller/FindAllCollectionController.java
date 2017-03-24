package com.union.tsw.findallcollection.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.findShoppingcar.pojo.FindShoppingcar;
import com.union.tsw.findallcollection.pojo.FindAllCollection;
import com.union.tsw.findallcollection.service.FindAllCollectionService;


@Controller
public class FindAllCollectionController {

	@Autowired
	public FindAllCollectionService findAllCollectionService;

	@RequestMapping("/findAllCollection")
	public @ResponseBody List<FindAllCollection> findAllCollection() {

		List<FindAllCollection> findAllCollection = findAllCollectionService.findAllCollection();
		System.out.println(findAllCollection);
		return findAllCollection;

	}
	
	@RequestMapping("findCollectionByUserId")
	public String findCollectionByUserId(FindAllCollection id,HttpServletRequest request){
		List<FindAllCollection> collection=null;
		collection=findAllCollectionService.findCollectionByUserId(id);
		request.setAttribute("collection", collection);
		
		return collection!=null ? "collection.jsp":"error.jsp";
		
	}


}
