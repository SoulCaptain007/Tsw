package com.union.tsw.book.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.union.tsw.book.mapper.BookMapper;
import com.union.tsw.book.pojo.Book;
import com.union.tsw.book.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	public BookMapper bookMapper;
	
	@Override
	public List<Book> findBookByName(Book book){
		return bookMapper.selectByName(book);
	}

	@Override
	public List<Book> findBookByAuthor(Book book) {
		return bookMapper.selectByAuthor(book);
	}

	@Override
	public List<Book> findBookByType(Book book) {
		return bookMapper.selectByType(book);
	}

	@Override
	public Book findBookByImage(Book book) {
		return bookMapper.selectByImage(book);
	}
}

