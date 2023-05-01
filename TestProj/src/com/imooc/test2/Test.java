package com.imooc.test2;

public class Test {
    public static void main(String[] args) {
		System.out.print("父类信息测试：");
		NonMotor one =new NonMotor("天宇","红",4,2);
		System.out.println(one.work());
		System.out.print("自行车类信息测试：");
		Bicycle two=new Bicycle();
		System.out.println(two.work());
		System.out.print("电动车类信息测试：");
		ElectricVehicle three=new ElectricVehicle();
		three.setBatteryName("飞鸽牌");
		System.out.println(three.work());
		System.out.print("三轮车类信息测试：");
		Tricycle four=new Tricycle();
		System.out.println(four.work());
		
	
		
	}
}
