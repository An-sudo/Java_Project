package com.Imooc.method;

public class Rectangle {
	//求长方形面积的方法
	
	public int area() {
		int length=10;
		int width=5;
		int getarea=length*width;
		return getarea;//返回一个值
	}
	
	
	
	public static void main(String[] args) {
		Rectangle rc =new Rectangle();
		System.out.println("长方形的面积为：");
		int area=rc.area();
		System.out.println(area);
		
	}

}
