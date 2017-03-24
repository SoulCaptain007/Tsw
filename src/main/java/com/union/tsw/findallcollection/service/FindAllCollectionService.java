package com.union.tsw.findallcollection.service;

import java.util.List;

import com.union.tsw.findallcollection.pojo.FindAllCollection;

public interface FindAllCollectionService {

	List<FindAllCollection> findAllCollection();
	public List<FindAllCollection> findCollectionByUserId(FindAllCollection id);


}
