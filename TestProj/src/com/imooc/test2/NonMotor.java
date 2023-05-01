package com.imooc.test2;

public class NonMotor {
    // 私有属性：品牌、颜色、轮子(默认2个)、座椅（默认 1个）
	private String name;
	private String color;
	private int wheel;
	private int seat;
	

	// 无参构造方法
	public NonMotor() {
		
	}
	// 双参构造方法，完成对品牌和颜色的赋值
	public NonMotor(String name,String color) {
		this.setName(name);
		this.setColor(color);
	}
	// 四参构造方法，分别对所有属性赋值
	public NonMotor(String name,String color,int wheel ,int seat) {
		this.setName(name);
		this.setColor(color);
		this.setWheel(wheel);
		this.setSeat(seat);
	}
   // 公有的get***/set***方法完成属性封装
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setWheel(int wheel) {
		this.wheel=wheel;
	}
	public int getWheel() {
		return this.wheel ;
	}
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public int getSeat() {
		return this.seat;
	}
	// 方法：运行，描述内容为：这是一辆**颜色的，**牌的非机动车，有**个轮子，有**个座椅的非机动车。其中**的数据由属性提供
	public String work() {
		String str="这是一辆"+this.getColor()+"颜色的，"+this.getName()+"牌的非机动车，有"+this.getWheel()+"个轮子，有"
				+this.getSeat()+"个座椅的非机动车。";
		return str;
	}
}
