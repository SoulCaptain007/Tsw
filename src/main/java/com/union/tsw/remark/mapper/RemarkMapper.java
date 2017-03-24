package com.union.tsw.remark.mapper;

import java.util.List;

import com.union.tsw.remark.pojo.Remark;

public interface RemarkMapper {
    int deleteByPrimaryKey(Integer remarkId);

    int saveRemark(Remark record);

    int insertSelective(Remark record);

    Remark selectByPrimaryKey(Integer remarkId);

    int updateByPrimaryKeySelective(Remark record);

    int updateByPrimaryKey(Remark record);
    
    public List<Remark> findAllRemark();
}