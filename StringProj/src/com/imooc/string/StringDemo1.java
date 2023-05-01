package com.imooc.string;

public class StringDemo1 {
	public static void main(String[] args) {
		//定义一个字符串“JAVA 编程 基础”
		//JAVA   编程  基础
		//0123 4 5 6 7 8 9
		String str="JAVA 编程 基础";
		//打印输出字符串的长度
		System.out.println("字符串的长度是："+str.length());
		
		//取出字符'程'，并输出      String.charAt(int index)
		System.out.println(str.charAt(6));
		
		//取出子串“编程 基础”，并输出  String.substring(int beginindex)  从beginindex位置开始到结束的字符
		System.out.println(str.substring(5));
		
		//取出子串”编程“，并输出   String.substring(int beginindex,int endindex) 输出56位置的字符 endindex之前的
		System.out.println(str.substring(5,7));
	}
}
