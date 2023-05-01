package com.imooc.test16;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("小狗"+getName()+"在做游戏!");
		
	}

}
