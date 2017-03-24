package com.union.tsw.remark.pojo;

import java.util.Date;

import com.union.tsw.user.pojo.User;

public class Remark {
    private Integer remarkId;

    private Date remarkTime;

    private String remarkContent;

    private Integer remarkState;

    private Integer userId;

    private Integer bookId;
    
    private User user;
    
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(Integer remarkId) {
        this.remarkId = remarkId;
    }

    public Date getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Date remarkTime) {
        this.remarkTime = remarkTime;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent == null ? null : remarkContent.trim();
    }

    public Integer getRemarkState() {
        return remarkState;
    }

    public void setRemarkState(Integer remarkState) {
        this.remarkState = remarkState;
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
}