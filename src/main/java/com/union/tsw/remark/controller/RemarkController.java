package com.union.tsw.remark.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.union.tsw.remark.pojo.Remark;
import com.union.tsw.remark.service.RemarkService;
import com.union.tsw.user.pojo.User;

@Controller
public class RemarkController {
	
	@Autowired
	public RemarkService remarkService;
	
	@RequestMapping("/findAllRemark")
	public @ResponseBody List<Remark> findAllRemark(){
		
		List<Remark> remark=remarkService.findAllRemark();
		
		return remark;
		
	}
	@RequestMapping("/saveRemark")
	public String saveRemark(Remark record,HttpServletRequest request){
			remarkService.saveRemark(record);
			List<Remark> remarks = remarkService.findAllRemark();
			request.setAttribute("record",remarks);
			return "success.jsp";
	}
	@RequestMapping("/removeRemark")
	public String deleteByPrimaryKey(Integer remarkId){
		remarkService.deleteByPrimaryKey(remarkId);
		
		return "bookInformation.jsp";
	}
}
