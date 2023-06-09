package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class Test {

	public static void main(String[] args) {

		// 1
		/*
		 *向上转型、隐式转型、自动转型
		 *小类转型为大类
		 *父类引用指向子类实例（意思是指向子类的具体哪一个方法），可以调用子类重写父类的方法以及父类派生的方法，无法调用子类独有的方法
 		 *注意：因为父类中的静态方法无法被子类重写，所以向上转型之后，只能调用到父类的原有的静态方法，如果就是想调用子类的静态方法，可以进行强制转换实例化之后调用
		 */
		Animal two = new Cat();// 2
		Animal three = new Dog();// 3

		two.eat();
		two.eat();
		two.getMonth();
		two.setMonth(2);
		three.eat();
		System.out.println("============================");
		/*
		 * 向下转型，强制类型转换 子类的引用指向父类对象，此处必须进行强转，可以调用子类特有的方法 必须满足转型条件才能进行强转
		 * instanceof运算符：返回true/false
		 * 表达式方法为:对象---instanceof---类
		 */
		if (two instanceof Cat) {
			Cat temp = (Cat) two;
			temp.eat();
			temp.run();
			temp.getMonth();
			System.out.println("two可以转换为Cat类型");
		}

		if (two instanceof Dog) {
			Dog temp2 = (Dog) two;
			temp2.eat();
			temp2.sleep();
			temp2.getSex();
			System.out.println("two可以转换为Dog类型");
		}

		if (two instanceof Animal) {
			System.out.println("Animal");
		}
		if(two instanceof Object) {
			System.out.println("Object");
		}
	}

}
