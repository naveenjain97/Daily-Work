package com.cts.mvc.example;

public class LoginBean {
	private String userName, password;
	public LoginBean() {
	}
	public String getUserName() {
		System.out.println("From getuser()");
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("From setUserName()");
	}
	public String getPassword() {
		System.out.println("from get Password");
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		System.out.println("from setpassword()");
	}

}
