package com.imooc.test16;

import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Dog d1 = new Dog("巴迪");
		Dog d2 = new Dog("豆豆");

		List<Dog> list1 = new ArrayList<>();
		list1.add(d1);
		list1.add(d2);

		Cat c1 = new Cat("花花");
		Cat c2 = new Cat("凡凡");

		List<Cat> list2 = new ArrayList<>();
		list2.add(c1);
		list2.add(c2);
		
		AnimalPlay one = new AnimalPlay();
		one.AnimalPlayer(list1);
		one.AnimalPlayer(list2);
	}

}
