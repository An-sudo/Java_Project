package com.imooc.animal;

public class Dog extends Animal{
	private String sex;
	public Dog() {
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void sleep () {
		System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，他在睡觉");
		
	}
	/*
	 * 方法重载
	 * 1、同一个类中
	 * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
	 * 3、方法返回值，访问修饰符任意
	 * 4、与方法的参数名称无关
	 * 5、不能相同的参数类型、相同的参数名、相同的顺序
	 * 
	 * 方法重写
	 * 1、有继承关系的子类中
	 * 2、子类重写父类的方法
	 * 3、方法名相同，参数列表相同(参数顺序、个数、类型)，返回值相同
	 * 4、访问修饰符?
	 * 5、与方法的参数名无关
	 * */
//	public String sleep(String name) {
//		return "";
//	}
//	
//	public void sleep(String name,int month) {
//		
//	}
//	public void sleep(int month,String name) {
//		
//	}
//	public void sleep(String name1,int month1) {
//		
//	}
	//子类重写父类吃东西的方法
	public void eat() {
		System.out.println(this.getName()+"最近没有食欲~~");
	}
	public void eat(String month) {
		System.out.println(month+"最近没有食欲");
	}
}
