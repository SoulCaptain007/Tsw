package com.union.tsw.orderform.pojo;

import com.union.tsw.book.pojo.Book;

public class Orderdetails {
    private Integer orderdetailsId;

    private Integer orderdetailsCount;

    private Integer orderformId;

    private Integer bookId;

    private Book book;
    
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Integer getOrderdetailsId() {
        return orderdetailsId;
    }

    public void setOrderdetailsId(Integer orderdetailsId) {
        this.orderdetailsId = orderdetailsId;
    }

    public Integer getOrderdetailsCount() {
        return orderdetailsCount;
    }

    public void setOrderdetailsCount(Integer orderdetailsCount) {
        this.orderdetailsCount = orderdetailsCount;
    }

    public Integer getOrderformId() {
        return orderformId;
    }

    public void setOrderformId(Integer orderformId) {
        this.orderformId = orderformId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
}