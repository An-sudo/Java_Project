package com.imooc.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class WordDemo {
	public static void main(String[] args) {
		// 将英文单词添加发哦HashSet中
		Set<String> set = new HashSet<String>();
		// 向集合中添加元素
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		// 显示集合的内容
		System.out.println("集合中的元素：");
		// 遍历迭代器并输出元素
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("******************************");
		// 在集合中插入一个单词
		// set.add("green");
		
		//插入一个重复的元素
		set.add("white");
		it = set.iterator();
		System.out.println("插入重复元素后：");
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}//插入失败，但不会报错
		
	}
}
