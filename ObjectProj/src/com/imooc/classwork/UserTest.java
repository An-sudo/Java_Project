package com.imooc.classwork;

public class UserTest {
	public static void main(String[] args) {
		User one =new User("Lucy","123456");
		User two =new User("Mike","123456");
		one.showIfor();
		two.showIfor();
		System.out.println("==================");
		UserManager thr=new UserManager();
		System.out.println(thr.check(one, two));
		
	}
}

