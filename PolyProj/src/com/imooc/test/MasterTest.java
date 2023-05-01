package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

public class MasterTest {
	public static void main(String[] args) {
		Master master = new Master();
//方法一和二		
		Cat cat = new Cat();
		Dog dog = new Dog();

		master.feed(cat);
		master.feed(dog);

		System.out.println("==============");
		// 方法一
		// boolean isManyTime=true;
		// Animal temp
		// if(isManyTime) {
		// temp=master.hasManyTime();
		// }else {
		// temp=master.hasLittleTime();
		// }
		// System.out.println(temp);

		// 方法二
		boolean isManyTime = true;
		Animal temp = master.raise(isManyTime);
		System.out.println(temp);

	}
}
