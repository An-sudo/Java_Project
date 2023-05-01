package com.imooc.homework;

public class Workers {
	private String name;
	private String no;
	private String sex;
	private int age;
	//无参构造
	public Workers() {
		
	}

	//有参构造
	public Workers(String name,String no,String sex,int age) {
		this.setName(name);
		this.setNo(no);
		this.setSex(sex);
		this.setAge(age);
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getNo() {
		return this.no;
	}

	public void setSex(String sex) {
		if(sex.equals("女")) {
			this.sex=sex;
		}else {
			this.sex = "男";
		}
	}

	public String getSex() {
		return this.sex;
	}

	public void setAge(int age) {
		if(age>18&age<65) {
			this.age=age;
		}else {
			this.age=18;
		}
	}

	public int getAge() {
		return this.age;
	}
	
	

	public String ifor(Department myDepartment,Duty myDuty) {
		String str="姓名："+this.getName()+"\n工号："+this.getNo()+"\n性别："+this.getSex()+"\n年龄："
				+this.getAge()+"\n职务："+myDepartment.getDepartment()+myDuty.getDuty();
		return str;
	}
	public void sss() {
		System.out.println("===============================");
	}
}
