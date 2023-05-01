package com.imooc.test;

import java.util.Scanner;

public class TryDemoOne {
	public static void main(String[] args) {
		/*
		 * //要求：定义两个整数，输出两数之商
		 * 
		 * int one =12; int two=2; System.out.println("one和two的商是"+(one/two));
		 */

		// 要求：定义两个整数，接收用户的键盘输入，输出两数之商
		Scanner input = new Scanner(System.in);
		System.out.println("运算开始");
		try {
			System.out.print("请输入第一个整数：");
			int one = input.nextInt();
			System.out.print("请输入第二个整数：");
			int two = input.nextInt();
			System.out.println("第一个数字和第二个数字商是" + (one / two));
			
		} catch (Exception e) {
			System.exit(1);
			e.printStackTrace();
			System.out.println("程序出错啦");
		}finally {
			System.out.println("运算结束");
		}
	}

}
