package com.Imooc.method;

import java.util.Scanner;

public class FacDemo {
	// 方法不能嵌套定义
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s = s * i;

		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FacDemo facDemo = new FacDemo();
		System.out.print("请输入一个数以求他的阶乘");
		int a = sc.nextInt();
		int fac = facDemo.fac(a);
		System.out.println(a + "的阶乘为：" + fac);
		// 求1！+2！+3！+4!+5!
		int sum = 0;
		int a1, a2, a3;
		a3 = sc.nextInt();
		a1=a3;
		a2=a3;
		for (int i = a1; i < a1 + 7; i++) {
			fac = facDemo.fac(i);
			sum = sum + fac;
		}
		System.out.print(a1 + "到" + (a2 + 7 )+ "的阶乘的累加和为：" + sum);
	}

}
