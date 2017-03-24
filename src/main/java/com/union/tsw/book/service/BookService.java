package com.union.tsw.book.service;

import java.util.List;

import com.union.tsw.book.pojo.Book;

public interface BookService {
	public List<Book> findBookByName(Book book);
	
	public List<Book> findBookByAuthor(Book book);
	
	public List<Book> findBookByType(Book book);
	
	public Book findBookByImage(Book book);
}