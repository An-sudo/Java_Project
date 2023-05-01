package com.imooc.classwork;
public class UserManager {
	public String check(User one,User two) {
		String msg="";
		if(one.getUsername()==null|two.getUsername()==null) {
			msg=msg+"用户名存在空";
		}else if(one.getUsername().equals(two.getUsername())) {
			msg=msg+"用户名一致";
		}else {
			msg=msg+"用户名不一致";
		}
		if(one.getPassword()==null|two.getPassword()==null) {
			msg=msg+"密码存在空";
		}else if(one.getPassword().equals(two.getPassword())) {
			msg=msg+"密码一致";
		}else {
			msg=msg+"密码不一致";
		}
		return msg;
	}
}
