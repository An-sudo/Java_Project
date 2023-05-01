package com.imooc.test5;

public class Car {
	// 属性：车的颜色color、车主姓名userName
	private String color;
	private String useName;

	public Car() {

	}
	// 带参构造函数（参数为color和useName）
	public Car(String color,String useName) {
		this.setColor(color);
		this.setUserName(useName);
	}
	// 通过封装实现对私有属性的get/set操作
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getUseName() {
		return useName;
	}

	public void setUserName(String useName) {
		this.useName = useName;
	}
	// 创建无参无返回值得方法use（描述内容为：我是机动车！）
	public void use() {
		System.out.println("我是机动车！");
	}
	// 重写equals方法，比较两个对象是否相等（比较color，userName）
	public Boolean equals(Car car) {
		if(car==null) {
			return false;
		}else if(this.getColor().equals(car.getColor())&&this.getUseName()==car.getUseName()) {
			return true;
		}else
			return false;
	}
}
