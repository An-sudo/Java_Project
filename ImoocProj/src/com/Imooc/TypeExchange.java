package com.Imooc;

public class TypeExchange {
	public static void main(String[] args) {
      //char类型和int类型之间的转换
		char c = (char)65537;
		int n;
		n=c;//隐式类型转换
		c=(char)n;
		
		//整型和浮点型的类型转换问题
		int x=100;
		long y=x;
		x=(int)y;
		float f= 100000000000000l;
		System.out.println(f);
		float f1=18978;
		System.out.println(f1);
		
	}

}
