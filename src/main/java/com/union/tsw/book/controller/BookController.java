package com.union.tsw.book.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.union.tsw.book.pojo.Book;
import com.union.tsw.book.service.BookService;


@Controller
public class BookController {
	@Autowired
	public BookService bookService;

	@RequestMapping("/findBookByName")
	public String findByName(Book book,HttpServletRequest request) {
		List<Book> book2 = null;
		
		book2 = bookService.findBookByName(book);
		HttpSession session = request.getSession();
		session.setAttribute("book", book2);
		return book2 != null ? "findBook.jsp":"index.jsp";
	}
	
	@RequestMapping("/findBookByAuthor")
	public String findByAuthor(Book book,HttpServletRequest request) {
		List<Book> book2 = null;
		System.out.println(book.getBookAuthor());
		book2 = bookService.findBookByAuthor(book);
		System.out.println(" È√˚£∫"+book2);
		HttpSession session = request.getSession();
		session.setAttribute("book", book2);
		
		return book2 != null ? "findBook.jsp":"index.jsp";
	}
	
	@RequestMapping("/findBookByType")
	public String findByType(Book book,HttpServletRequest request) {
		List<Book> book2 = null;
		book2 = bookService.findBookByType(book);
		HttpSession session = request.getSession();
		session.setAttribute("book", book2);
		
		return book2 != null ? "findBook.jsp":"index.jsp";
	}
	
	@RequestMapping("/findBookByImage")
	public String findByImage(Book book,HttpServletRequest request) {
		System.out.println("bookimage=" + book.getBookImage());
		Book onebook = null;
		onebook = bookService.findBookByImage(book);
		HttpSession session = request.getSession();
		session.setAttribute("onebook", onebook);
		
		return "bookInformation.jsp";
	}
	
	@RequestMapping("/showBookByType")
	public String showByType(Book book,HttpServletRequest request) {
		List<Book> books = null;
		books = bookService.findBookByType(book);
		HttpSession session = request.getSession();
		session.setAttribute("books", books);
		
		return "showBookByType.jsp";
	}
}

