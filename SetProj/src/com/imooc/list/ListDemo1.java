package com.imooc.list;

import java.util.List;
import java.util.ArrayList;

public class ListDemo1 {
	public static void main(String[] args) {
		// 用ArrayList存储编程语言的名称，并输出
		List list = new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		list.add("swift");
		//输出列表中元素的个数
		System.out.println("列表中元素的个数为："+list.size());
		//遍历输出所有编程语言
		System.out.println("********************************");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		//移除列表中的C++
		System.out.println();
		//两种remove的方法
        //list.remove(2);
		list.remove("C++");
		System.out.println("********************************");
		System.out.print("移除C++以后的列表元素为:");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		
		
		
		
		
	}
}
