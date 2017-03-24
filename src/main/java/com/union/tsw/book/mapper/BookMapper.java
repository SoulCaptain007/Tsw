package com.union.tsw.book.mapper;

import java.util.List;

import com.union.tsw.book.pojo.Book;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);
    
    List<Book> selectByName(Book book);
    
    List<Book> selectByAuthor(Book book);
    
    List<Book> selectByType(Book book);
    
    Book selectByImage(Book book);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}