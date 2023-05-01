package com.imooc.animal;
public class CatTest {
	public static void main(String[] args) {
		Cat one = new Cat(3);
//		one.setName("凡凡");
//		one.setMonth(0);
//		one.weight=1200;
//		one.species="中华田园猫";
		//System.out.println("昵称："+one.getName());
		if(one.getMonth()==0) {
			return;
		}
		System.out.println("年龄："+one.getMonth());
//		System.out.println(one.weight);
//		System.out.println(one.species);

	}
}


