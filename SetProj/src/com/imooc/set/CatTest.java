package com.imooc.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CatTest {
	public static void main(String[] args) {
		Cat huahua = new Cat("花花", 12, "英国短毛猫");
		Cat fanfan = new Cat("凡凡", 3, "中华田园猫");

		Set<Cat> set = new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		// 显示宠物猫的信息
		Iterator<Cat> it = set.iterator();// <> 泛型
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
		// 再添加一个与花花属性一样的猫
		Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
		set.add(huahua01);
		System.out.println("*****************");
		System.out.println("添加重复数据后的宠物猫信息：");
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("*****************");
		// 重新插入一个新宠物猫
		Cat huahua02 = new Cat("花花二代", 2, "英国短毛猫");
		set.add(huahua02);
		System.out.println("添加花花二代后的宠物猫信息：");
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("*****************");
		// 在集合中查找花花的信息并输出
		if (set.contains(huahua)) {
			System.out.println("花花找到了!");
		} else {
			System.out.println("花花没找到!");
		}
		System.out.println("*****************");
		// 在集合中使用 名字 查找花花的信息
		System.out.println("通过名字查找花花信息：");
		boolean flag = false;
		Cat c = null;
		it = set.iterator();
		while (it.hasNext()) {
			c = it.next();
			if (c.getName().equals("花花")) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("花花找到了!");
			System.out.println(c);
		} else {
			System.out.println("花花没找到!");
		}
		System.out.println("******************");
		// 删除花花二代的信息并重新输出
//		for (Cat cat : set) {
//			if ("花花二代".equals(cat.getName())) {
//				set.remove(cat);break;
//			}
//		}
		//删除年龄小于5都删除
		Set<Cat> set1=new HashSet<Cat>();
		for (Cat cat : set) {
			if (cat.getMonth()<5) {
				set1.add(cat);
			}
		}
		set.removeAll(set1);
		
		System.out.println("删除花花二代后的数据");
		for (Cat cat : set) {
			System.out.println(cat);
		}
		System.out.println("******************");
		// 删除集合中的所有宠物猫的信息
		boolean flag1 = set.removeAll(set);
		if (flag) {
			System.out.println("猫都不见了。。。");
		} else {
			System.out.println("猫还在。。。");
		}
		// 也可以用isEmpty()来判断集合是否为空
//		if(set.isEmpty()) {
//			System.out.println("猫都不见了。。。");
//		}else {
//			System.out.println("猫还在。。。");
//		}
	}
}
