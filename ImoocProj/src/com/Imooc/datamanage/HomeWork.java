package com.Imooc.datamanage;

import java.util.Scanner;

/**
 * 初始化数学成绩
 * 
 * @author ansmacbookpro
 */
public class HomeWork {
	public float[] initScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要存储的数学成绩的数量：");
		int i = sc.nextInt();
		float[] a = new float[i];
		for (int s = 0; s < a.length; s++) {
			System.out.println("请输入第" + (s + 1) + "个数据");
			try {
				a[s] = sc.nextFloat();
			} catch (java.util.InputMismatchException e) {
				sc.next();
				s--;
				System.out.println("输入错误！请输入正确的字符！");
			}
		}
		return a;
	}

	/**
	 * 求成绩平均值
	 * 
	 * @param f为数组
	 * @return
	 */
	public float average(float[] f) {
		float avgs = 0, sum = 0;
		for (int i = 0; i < f.length; i++) {
			sum = sum + f[i];
		}
		avgs = sum / f.length;
		return avgs;
	}

	/**
	 * 统计成绩大于85分的人数
	 * 
	 * @param f:所有数学成绩
	 */
	public int count(float[] f) {
		int a = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] > 85) {
				a++;
			}
		}
		return a;
	}

	/**
	 * 更改数据
	 * 
	 * @param f为数组
	 */
	public void updata(float[] f) {
		Scanner sc = new Scanner(System.in);
		System.out.println("修改前：");
		for (float n : f) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int count = 0; count < 1; count++) {
			System.out.println("请输入要修改数据的位置（从0开始）：");
			int n = sc.nextInt();
			System.out.println("请输入新数据：");
			float m = sc.nextFloat();
			if (n < 5 | n >= 0) {
				f[n] = m;
			} else {
				System.out.println("你输入要修改的位置有误，请重新输入0-4之间的整数");
				count--;
			}
		}
		System.out.println("修改后：");
		System.out.println("成绩为：");
		for (float count1 : f) {
			System.out.print(count1 + " ");
		}
		System.out.println();
	}

	/**
	 * 输出所有成绩
	 * 
	 * @param 
	 */
	public void displayAllScore(float f[]) {
		if (f==null){
			System.out.println("还未录入成绩！请先初始化");
		}else{
		System.out.println("成绩为：");
		for (float i : f) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
	}
	/**
	 * 显示菜单
	 */
	public void displayMenu() {
		System.out.println("**********************************************");
		System.out.println(" 	1--初始化数学成绩");
		System.out.println("	2--求成绩的平均值");
		System.out.println("	3--统计成绩大于85分的人数");
		System.out.println("	4--修改指定位置处的成绩");
		System.out.println("	5--打印输出所有成绩");
		System.out.println("	0--退出");
		System.out.println("**********************************************");
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HomeWork dm = new HomeWork();
		float arr[] = null;
		while (true) {
			dm.displayMenu();
			System.out.println("请输入对应的数字进行操作");
			try {
				int input = sc.nextInt();
				if (input == 0) {
					System.out.println("退出程序！");
					break;
				}

				switch (input) {
				case 1:
					arr = dm.initScore();
					break;
				case 2:
					System.out.print("数学平均成绩为：");
					System.out.println(dm.average(arr));
					break;
				case 3:
					System.out.print("成绩大于85分的人数为：");
					System.out.println(dm.count(arr));
					break;
				case 4:
					dm.updata(arr);
					break;
				case 5:
					dm.displayAllScore(arr);
					break;
				default:
					System.out.println("输入的数字有误请重新输入");
					break;
				}

			} catch (java.util.InputMismatchException e) {
				sc.next();
				System.out.println("警告！输入错误！");
				System.out.println("请按照指令输入相应的数字！");
			}

		}

	}

}
