package com.union.tsw.findallcollection.mapper;

import java.util.List;

import com.union.tsw.collection.pojo.Collection;
import com.union.tsw.findallcollection.pojo.FindAllCollection;

public interface FindAllCollectionMapper {
	
	List<FindAllCollection> findAllCollection();
	public List<FindAllCollection> findCollectionByUserId(FindAllCollection id);
	
}
