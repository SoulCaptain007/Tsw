package com.union.tsw.findallcollection.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.findallcollection.mapper.FindAllCollectionMapper;
import com.union.tsw.findallcollection.pojo.FindAllCollection;
import com.union.tsw.findallcollection.service.FindAllCollectionService;

@Service("findAllCollectionService")
public class FindAllCollectionServiceImpl implements FindAllCollectionService{
	
	@Autowired
	public FindAllCollectionMapper findAllCollectionMapper;
	
	@Override
	public List<FindAllCollection> findAllCollection() {
		// TODO Auto-generated method stub
		return findAllCollectionMapper.findAllCollection();
	}

	@Override
	public List<FindAllCollection> findCollectionByUserId(FindAllCollection id) {
		// TODO Auto-generated method stub
		return findAllCollectionMapper.findCollectionByUserId(id);
	}

}
