package com.union.tsw.shoppingcar.pojo;

public class ShoppingCar {
    private Integer shoppingcarId;

    private Integer shoppingcarCount;

    private Integer shoppingcarState;

    private Integer userId;

    private Integer bookId;

    public Integer getShoppingcarId() {
        return shoppingcarId;
    }

    public void setShoppingcarId(Integer shoppingcarId) {
        this.shoppingcarId = shoppingcarId;
    }

    public Integer getShoppingcarCount() {
        return shoppingcarCount;
    }

    public void setShoppingcarCount(Integer shoppingcarCount) {
        this.shoppingcarCount = shoppingcarCount;
    }

    public Integer getShoppingcarState() {
        return shoppingcarState;
    }

    public void setShoppingcarState(Integer shoppingcarState) {
        this.shoppingcarState = shoppingcarState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

	@Override
	public String toString() {
		return "shoppingcarId=" + shoppingcarId
				+ ", shoppingcarCount=" + shoppingcarCount
				+ ", shoppingcarState=" + shoppingcarState + ", userId="
				+ userId + ", bookId=" + bookId;
	}
    
}