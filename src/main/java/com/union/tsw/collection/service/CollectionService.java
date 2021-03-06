package com.union.tsw.collection.service;

import java.util.List;

import com.union.tsw.collection.pojo.Collection;

public interface CollectionService {
	int deleteByPrimaryKey(Integer collectionId);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer collectionId);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
    
    int saveCollection (Collection c);
    
    int removeCollection (Collection c);
    
    List<Collection> findAllCollection (Collection record);
}
