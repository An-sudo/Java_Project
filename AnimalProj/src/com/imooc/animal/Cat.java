package com.imooc.animal;

public class Cat extends Animal{
	private double weight;
//	public int temp =1; 
	public Cat() {
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//跑动的方法
	public void run() {
		System.out.println(this.getName()+"是一只"+this.getSpecies()+"的猫，他在快乐的奔跑");
	}
}
