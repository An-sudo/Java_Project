package com.imooc.test7;

public class Test {

	public static void main(String[] args) {
		// 生成父类对象数组,数组长度为5
		Animal[] a = new Animal[5];
		// 产生随机数，随机产生三种具体子类的实例

		for (int i = 0; i < a.length; i++) {
			int s = (int) (Math.random() * 3);
			if (s == 0) {
				a[i] = new Cat();
			} else if (s == 1) {
				a[i] = new Dog();
			} else {
				a[i] = new Sheep();
			}
		}

		// 循环输出，循环体中每个对象分别调用cry()方法。
		for (int i = 0; i < a.length; i++) {
			a[i].cry();
		}

	}
}

//方法二
//	switch(s)
//	{
//case 0:
//	a[i]= new Cat();break;
//case 1:
//	a[i]=new Dog();break;
//case 2:
//	a[i]=new Sheep();break;
//}
