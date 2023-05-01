package com.imooc.test8;

//测试类
public class Test {

  public static void main(String[] args) {
	    //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
	  	Rectangle rectangle =new Rectangle(13,15);
	  	Circle circle =new Circle(6);
		//调用area（）方法，输出结果
	  	System.out.println("圆的面积为："+circle.area());
	  	System.out.println("矩形的面积为："+rectangle.area());
	}
}
