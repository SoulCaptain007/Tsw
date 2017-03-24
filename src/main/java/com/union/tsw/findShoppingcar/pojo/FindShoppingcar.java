package com.union.tsw.findShoppingcar.pojo;

public class FindShoppingcar {
	private int userId;
	private int bookId;
	private int shoppingcarId;
	private String userName;
	private String bookImage;
	private String bookName;
	private double bookPrice;
	private int shoppingcarCount;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getShoppingcarId() {
		return shoppingcarId;
	}
	public void setShoppingcarId(int shoppingcarId) {
		this.shoppingcarId = shoppingcarId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
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
	public int getShoppingcarCount() {
		return shoppingcarCount;
	}
	public void setShoppingcarCount(int shoppingcarCount) {
		this.shoppingcarCount = shoppingcarCount;
	}
	public FindShoppingcar() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FindShoppingcar [图片=" + bookImage + ", 书名=" + bookName
				+ ", 价格=" + bookPrice + ", 数量="
				+ shoppingcarCount + "]";
	}
	
	

}
