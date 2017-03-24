package com.union.tsw.user.pojo;

import java.util.Arrays;
import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private Integer userAge;

    private String userSex;

    private String userAddress;

    private Date userDate;

    private String userEmail;

    private Double userMoney;

    private Integer userPhone;

    private Integer userState;

    private byte[] userImage;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Double userMoney) {
        this.userMoney = userMoney;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

	@Override
	public String toString() {
		return "userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userAge=" + userAge
				+ ", userSex=" + userSex + ", userAddress=" + userAddress
				+ ", userDate=" + userDate + ", userEmail=" + userEmail
				+ ", userMoney=" + userMoney + ", userPhone=" + userPhone
				+ ", userState=" + userState + ", userImage="
				+ Arrays.toString(userImage);
	}
    
}