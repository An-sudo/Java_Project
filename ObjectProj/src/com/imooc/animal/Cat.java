package com.imooc.animal;

/**
 * 宠物猫类
 * 
 * @author ansmacbookpro
 *
 */
public class Cat {
	// 成员属性:昵称、年龄、体重、品种
	// 修改属性的可见性-----private 限定只能在当前的类内进行访问
	private String name; // 昵称
	private int month; // 年龄
	private double weight; // 体重
	private String species; // 品种

	public Cat() {
		System.out.println("我是宠物猫");
	}

	public Cat(int month) {
		this.setMonth(month);
		// this.month=month;
	}

	// 创建get/set方法
	// 在get和set方法中添加对属性的限定
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "我是一只名叫" + this.name + "猫咪";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0) {
			System.out.println("输入信息错误，宠物猫的年龄必须大于0");
		} else {
			this.month = month;
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	// -----------------------------------------------------------------
	public void run(String name) {
		System.out.println(name + "快跑");
	}

	// 方法：跑动、吃东西。
	// 跑动的方法
	public void run() {
		this.eat();
		System.out.println("小猫快跑");
	}

	// 吃东西的方法
	public void eat() {
		System.out.println("小猫吃鱼");
	}
}
