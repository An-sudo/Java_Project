package com.imooc.string;

public class StringDemo5 {
	public static void main(String[] args) {
		// ==和equals方法的区别
		// 定义三个字符串，内容都是imooc
		String str1 = "imooc";
		String str2 = "imooc";
		String str3 = new String("imooc");
		String str4 = new String("imooc");
		System.out.println("str1和str2的内容是否相同？"+(str1.equals(str2)));//true
		System.out.println("str1和str3的内容是否相同？"+(str1.equals(str3)));//true
		System.out.println("==============");
		System.out.println("str1和str2的地址是否相同？"+(str1==str2));
		System.out.println("str1和str3的地址是否相同？"+(str1==str3));
		System.out.println("str3和str4的地址是否相同？"+(str3==str4));
		
	}
}
