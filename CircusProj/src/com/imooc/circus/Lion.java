package com.imooc.circus;

public class Lion extends Animal implements IAct {
	private String color;
	private String sex;
	
	public Lion() {
		
	}
	
	public Lion(String name,String age,String color,String sex) {
		super(name,age);
		this.setColor(color);
		this.setSex(sex);
	}
	
	public void setColor(String color) {
		this.color =color;
	}
	public String getColor() {
		return this.color;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}
	public String getSex() {
		return this.sex;
	}
	@Override
	public String skill() {
		// TODO Auto-generated method stub
		return "擅长钻火圈";
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String love() {
		// TODO Auto-generated method stub
		return "喜欢吃各种肉类";
	}
	
	
	
	
}
