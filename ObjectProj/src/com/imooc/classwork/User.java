package com.imooc.classwork;
public class User {
	private String username;
	private String password;
	public User(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public User() {
	}
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public void showIfor() {
		System.out.println("用户名："+getUsername());
		System.out.println("密码："+getPassword());
	}
}
