package com.Imooc.operator;

public class MathDemo1 {
	public static void main (String[] args) {
		//x++
		int x = 4;
		int y ;
		y=(x++)+5;
		System.out.println("x="+x+",y="+y);//  5    9
		//++x的形式
		x=4;
		y=(++x)+5;
		System.out.println("x="+x+",y="+y);// 5   10
		//x--的形式
		x=4;
		y=(x--)+5;
		System.out.println("x="+x+",y="+y);// 3   9
		//--x
		x=4;
		y=(--x)+5;
		System.out.println("x="+x+",y="+y);//3  8
		
		
	} 

}
