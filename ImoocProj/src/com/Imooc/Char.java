package com.Imooc;

public class Char {

	public static void main(String[] args) {
		char a='a';
		System.out.println("a="+a);
		char b=65535;    //0-65535是char的范围，如果在高需要强制转换。
		System.out.println("b="+b);
		//定义变量存放unicode编码表示的字符
		char c='s';
		System.out.println("c="+c); 
	}

}
