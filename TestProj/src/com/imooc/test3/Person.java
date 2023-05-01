package com.imooc.test3;

public class Person{
    //私有属性：name（姓名）、age(年龄)、sex（性别）
    private String name;
    private int age;
    private String sex;
    
    public Person() {
    	
    }

    //带参构造方法（name、age、sex为参数）
    public Person(String name,int age,String sex) {
    	setName(name);
    	setAge(age);
    	setSex(sex);
    }
	
    //通过封装实现对属性的get/set方法设定
    public void setName(String name) {
    	this.name =name;
    }
    public String getName() {
    	return this.name;
    }
    public void setAge(int age) {
    	this.age=age;
    }
    public int getAge() {
    	return this.age;
    }
    public void setSex(String sex) {
    	this.sex=sex;
    }
    public String getSex() {
    	return this.sex;
    }

    //重写toString方法，表示形式为：姓名：+**+  年龄：+**+  性别：+**
	 public String toString() {
		 String str="姓名："+this.getName()+"    年龄："+this.getAge()+"    性别："+this.getSex();
		 return str;
	 }



		
	
}
