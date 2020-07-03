package com.example.mail.mailsend.dto;

public class UserDTO {

	private int userId;
	private String userFname;
	private String userLname;
	private String userMobile;
	private String userEmail;
	private String userPassword;
	private String userAddress;
	private String userBday;
	private int activeStatus;
	private int gnNumber;

	public UserDTO() {
		super();
	}

	public UserDTO(int userId, String userFname, String userLname, String userMobile, String userEmail,
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
		return "UserDTO [userId=" + userId + ", userFname=" + userFname + ", userLname=" + userLname + ", userMobile="
				+ userMobile + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userAddress="
				+ userAddress + ", userBday=" + userBday + ", activeStatus=" + activeStatus + ", gnNumber=" + gnNumber
				+ "]";
	}

}
