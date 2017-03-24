package com.union.tsw.orderform.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Orderform implements Serializable{
    private Integer orderformId;

    private Date orderformDate;

    private Integer orderformState;

    private Integer userId;

    List<Orderdetails> orderdetails;
    
    public List<Orderdetails> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<Orderdetails> orderdetails) {
		this.orderdetails = orderdetails;
	}
    
    public Integer getOrderformId() {
        return orderformId;
    }

    public void setOrderformId(Integer orderformId) {
        this.orderformId = orderformId;
    }

    public Date getOrderformDate() {
        return orderformDate;
    }

    public void setOrderformDate(Date orderformDate) {
        this.orderformDate = orderformDate;
    }

    public Integer getOrderformState() {
        return orderformState;
    }

    public void setOrderformState(Integer orderformState) {
        this.orderformState = orderformState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}