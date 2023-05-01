package com.imooc.test4;

public class Test {
    public static void main(String[] args) {
		// 实例化2个父类对象，传入两组相同的参数值
    	Fruits fru1=new Fruits("圆形","酸");
    	Fruits fru2=new Fruits("圆形","酸");
		// 调用父类eat方法
		fru1.eat();
		// 测试重写equals方法，判断两个对象是否相等
		System.out.println("fru1和fru2的引用比较："+fru1.equals(fru2));
		System.out.println("————————————————————————————————————————");
		// 实例化子类对象，并传入相关参数值
		Waxberry wax=new Waxberry("圆形","果味酸甜适中");
		wax.setColor("紫红色");
		
		// 调用子类face方法和eat方法
		wax.face("杨梅");
		wax.eat("杨梅");
		
		

		// 测试重写toString方法，输出子类对象的信息
		System.out.println(wax.toString());


		System.out.println("————————————————————————————————————————");
		// 实例化Banana类对象，并传入相关参数值
		Banana ba=new Banana("短而稍圆","果肉香甜","仙人蕉");
		ba.advantage();
		// 调用子类的advantage和它的重载方法
		ba.advantage("黄色");

	}
}
