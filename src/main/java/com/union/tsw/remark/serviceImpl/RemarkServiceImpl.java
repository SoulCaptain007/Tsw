package com.union.tsw.remark.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.remark.mapper.RemarkMapper;
import com.union.tsw.remark.pojo.Remark;
import com.union.tsw.remark.service.RemarkService;

@Service("remarkService")
public class RemarkServiceImpl implements RemarkService{
	
	@Autowired
	public  RemarkMapper remarkmapper;

	@Override
	public List<Remark> findAllRemark() {
		// TODO Auto-generated method stub
		return remarkmapper.findAllRemark();
	}

	@Override
	public int deleteByPrimaryKey(Integer remarkId) {
		// TODO Auto-generated method stub
		return remarkmapper.deleteByPrimaryKey(remarkId);
	}

	@Override
	public int saveRemark(Remark record) {
		// TODO Auto-generated method stub
		return remarkmapper.saveRemark(record);
	}

	@Override
	public int insertSelective(Remark record) {
		// TODO Auto-generated method stub
		return remarkmapper.insertSelective(record);
	}

	@Override
	public Remark selectByPrimaryKey(Integer remarkId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Remark record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Remark record) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
