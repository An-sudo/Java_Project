package com.imooc.test;

import java.util.*;
import java.util.Scanner;

public class TryDemoThree {
	public static void main(String[] args) {
//		try {
//			int result = test();
//			System.out.println("one和two的商是：" + result);
//		}catch{
//			
//		}catch (ArithmeticException e) {
//			System.out.println("除数不能为0");
//		}catch(InputMismatchException e) {
//			System.out.println("除数不能为字母");
//		}
		try {
			int result = test();
			System.out.println("one和two的商是：" + result);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (InputMismatchException e) {
			System.out.println("除数不能为字母");
		}catch(Exception e) {
			System.out.println("除数不能为字母1");
		}
	}
	/*
	 * 通过throws抛出异常时，针对可能出现的多种异常情况，解决方案：
	 *  1、throws后面接多个异常类型，中间用逗号分隔
	 * 	2、throws后面接Exception
	 */
//	public static int test() throws ArithmeticException,InputMismatchException{
//		Scanner input = new Scanner(System.in);
//		System.out.println("运算开始");
//			System.out.print("请输入第一个整数：");
//			int one = input.nextInt();
//			System.out.print("请输入第二个整数：");
//			int two = input.nextInt();
//			System.out.println("运算结束");
//			return one / two;

	public static int test() throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("运算开始");
		System.out.print("请输入第一个整数：");
		int one = input.nextInt();
		System.out.print("请输入第二个整数：");
		int two = input.nextInt();
		System.out.println("运算结束");
		return one / two;

	}
}
