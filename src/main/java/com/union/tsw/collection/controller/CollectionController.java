package com.union.tsw.collection.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.collection.pojo.Collection;
import com.union.tsw.collection.service.CollectionService;

@Controller
public class CollectionController {
	@Autowired
	public CollectionService collectionService;
	
	/*@RequestMapping ("/saveCollection")
	public String saveCollection(Collection collection,HttpServletRequest request){
		Collection collection2=null;
		int a =collectionService.saveCollection(collection);
		request.getSession().setAttribute("collection", collection2);
		return a==1 ? "success.jsp" : "error.jsp";
	}*/
	/*@RequestMapping ("/removeCollection")
	public String removeCollection(Collection collection,HttpServletRequest request){
		Collection collection2=null;
		int a = collectionService.removeCollection(collection);
		request.getSession().setAttribute("collection", collection2);
		return a==1 ? "success.jsp" : "error.jsp";
	}*/
//	@RequestMapping ("/findAllCollection")
//	public @ResponseBody List<Collection> findAllCollection(Collection collection){
//		
//		List<Collection> collections = collectionService.findAllCollection(collection);
//		return collections;
//	}
	@RequestMapping("/removeCollection")
	public String removeCollection(Collection collection,Integer userId){
			collectionService.removeCollection(collection);
			return "findCollectionByUserId?userId="+userId;
	}
	@RequestMapping("/saveCollection")
	public String saveCollection(Collection collection){
			
			collectionService.saveCollection(collection);
			return "findCollectionByUserId?userId="+collection.getUserId();
	}

}