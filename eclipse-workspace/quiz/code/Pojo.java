package com.pointels.quizz;

public class Pojo {
	String userName;
	String password;
	
	public Pojo() {}
	
	public Pojo(String userName, String password) {
		this.userName = userName;
		this.password = password;
		System.out.println(this.userName + " " + this.password + "--> pojo");
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
}