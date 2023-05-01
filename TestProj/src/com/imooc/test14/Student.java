package com.imooc.test14;

public class Student {
	private String id;
	private String name;
	private int age;

	public Student() {

	}

	public Student(String id, String name, int age) {
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "[学号："+getId()+"，年龄："+getAge()+"，姓名："+getName()+"]";
	}
}
