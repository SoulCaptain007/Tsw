package com.union.tsw.collection.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.collection.mapper.CollectionMapper;
import com.union.tsw.collection.pojo.Collection;
import com.union.tsw.collection.service.CollectionService;
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService{
	@Autowired
	public CollectionMapper collectionMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer collectionId) {
		// TODO Auto-generated method stub
		return collectionMapper.deleteByPrimaryKey(collectionId);
	}

	@Override
	public int insert(Collection record) {
		// TODO Auto-generated method stub
		return collectionMapper.insert(record);
	}

	@Override
	public int insertSelective(Collection record) {
		// TODO Auto-generated method stub
		return collectionMapper.insertSelective(record);
	}

	@Override
	public Collection selectByPrimaryKey(Integer collectionId) {
		// TODO Auto-generated method stub
		return collectionMapper.selectByPrimaryKey(collectionId);
	}

	@Override
	public int updateByPrimaryKeySelective(Collection record) {
		// TODO Auto-generated method stub
		return collectionMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Collection record) {
		// TODO Auto-generated method stub
		return collectionMapper.updateByPrimaryKey(record);
	}

	@Override
	public int saveCollection(Collection c) {
		// TODO Auto-generated method stub
		return collectionMapper.saveCollection(c);
	}

	@Override
	public int removeCollection(Collection c) {
		// TODO Auto-generated method stub
		return collectionMapper.removeCollection(c);
	}

	@Override
	public List<Collection> findAllCollection(Collection record) {
		// TODO Auto-generated method stub
		return collectionMapper.findAllCollection(record);
	}

}
