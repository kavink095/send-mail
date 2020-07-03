package com.example.mail.mailsend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserEntity")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId", nullable = false, length = 12)
	private int userId;
	@Column(name = "userFname", nullable = false, length = 15)
	private String userFname;
	@Column(name = "userLname", nullable = false, length = 15)
	private String userLname;
	@Column(name = "userMobile", nullable = false, length = 10)
	private String userMobile;
	@Column(name = "userEmail", nullable = false, length = 100)
	private String userEmail;
	@Column(name = "userPassword", nullable = false, length = 50)
	private String userPassword;
	@Column(name = "userAddress", nullable = false, length = 30)
	private String userAddress;
	@Column(name = "userBday", nullable = false, length = 12)
	private String userBday;
	@Column(name = "activeStatus", nullable = false, length = 1)
	private int activeStatus;
	@Column(name = "gnNumber", nullable = false)
	private int gnNumber;

	public UserEntity() {
		super();
	}

	public UserEntity(int userId, String userFname, String userLname, String userMobile, String userEmail,
			String userPassword, String userAddress, String userBday, int activeStatus, int gnNumber) {
		super();
		this.userId = userId;
		this.userFname = userFname;
		this.userLname = userLname;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userBday = userBday;
		this.activeStatus = activeStatus;
		this.gnNumber = gnNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserBday() {
		return userBday;
	}

	public void setUserBday(String userBday) {
		this.userBday = userBday;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public int getGnNumber() {
		return gnNumber;
	}

	public void setGnNumber(int gnNumber) {
		this.gnNumber = gnNumber;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userFname=" + userFname + ", userLname=" + userLname
				+ ", userMobile=" + userMobile + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userAddress=" + userAddress + ", userBday=" + userBday + ", activeStatus=" + activeStatus
				+ ", gnNumber=" + gnNumber + "]";
	}

}
