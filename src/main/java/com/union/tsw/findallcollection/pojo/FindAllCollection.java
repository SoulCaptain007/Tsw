package com.union.tsw.findallcollection.pojo;

import java.util.Date;

public class FindAllCollection {
	private int userId;
	private String userName;
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookImage;
	private int collectionId;
	private Date collectionDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public int getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(int collectionId) {
		this.collectionId = collectionId;
	}
	public Date getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}
	public FindAllCollection(String userName, String bookName,
			double bookPrice, String bookImage, Date collectionDate) {
		super();
		this.userName = userName;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookImage = bookImage;
		this.collectionDate = collectionDate;
	}
	public FindAllCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
