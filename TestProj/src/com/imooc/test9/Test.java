package com.imooc.test9;

//测试类
public class Test {

  public static void main(String[] args) {
		  //对象实例化
       IFly one =new  Balloon();
       IFly two = new Bird();
       IFly three= new Plane();
        //分别调用fly()方法
      one.fly();
      two.fly();
      three.fly();

	}
}

