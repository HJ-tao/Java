package edu.cj.javaee.day0714.entity;

public class Users {
	private int userId;
	private String userName;
	private String userPass;
	private int userStatus;

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

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName
				+ ", userPass=" + userPass + ", userStatus=" + userStatus + "]";
	}

	public Users(int userId, String userName, String userPass, int userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userStatus = userStatus;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

}
