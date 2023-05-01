package com.imooc.test8;

//子类圆Circle类
public class Circle extends Shape {
  //属性：圆的半径r
	private double r;
  //创建带参构造方法以及无参构造方法
   public Circle() {
	   
   }
   public Circle(double r) {
	   this.setR(r);
   }
   
   public void setR(double r) {
	   this.r=r;
   }
   public double getR() {
	   return this.r;
   }
  //创建针对半径的赋值和取值方法
   
	//重写父类中area()方法
	public double area() {
		double area;
		area=r*r*3.1415;
		return area;
	}
}
