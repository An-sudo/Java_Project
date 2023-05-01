package com.Imooc.datamanage;

import java.util.Scanner;

/**
 * 从键盘接收整型数据存放到数组中，并对数组中的数据进行管理
 * 
 * @param args
 */
public class DataManage {

	/**
	 * 从键盘接收数据，给数组。
	 * 
	 * @return
	 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// 少接收一个数据，为在指定位置处插入一个数据做准备
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据：");
			try {
				a[i] = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字！");
				sc.next();
				i--;// 重新返回上一个数据
			}
		}
		return a;
	}

	/**
	 * 显示数组中元素的内容
	 * 
	 * @param a：数组
	 * @param length：要显示数组元素的个数
	 */
	public void showData(int[] a, int length) {
		for (int i = 1; i < length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}

	/**
	 * 从键盘接收一个数据，插入到数组的指定位置处。
	 * 
	 * @param a：要插入数据的数组。
	 * @param n：要插入的数据。
	 * @param k：要插入的位置,从0开始。
	 */
	public void insertAtArray(int[] a, int n, int k) {
		// 从最后一个数据开始移动，避免数据覆盖
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * 输出能被3整除的元素
	 * 
	 * @param a
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + ",";
				count++;
			}
		}
		if (count != 0) {
			System.out.println("有能被3整除的元素一共有：" + count + "个。");
			System.out.println("分别是：" + str);
		} else {
			System.out.println("没有能被3整除的元素");
		}
	}

	/**
	 * 提示信息
	 */
	public void notice() {
		System.out.println("*****************************************");
		System.out.println("           1--插入数据");
		System.out.println("           2--显示所有数据");
		System.out.println("           3--在指定位置处插入数据");
		System.out.println("           4--查询能被3整除的数据");
		System.out.println("           5--退出");
		System.out.println("*****************************************");
	}

	public static void main(String[] args) {
		DataManage dm = new DataManage();
		int arr[] = new int[10];
		int input;
		arr=null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			dm.notice();
			System.out.println("请输入对应的数字进行操作：");
			input=sc.nextInt();
			if(input==5) {
				System.out.println("退出程序！");
				break;
			}			
		switch (input) {
		case 1:
			arr=dm.insertData();
			System.out.println("输入的数据为：");
			dm.showData(arr, arr.length-1);
			break;
		case 2:
			if(arr!=null) {
				System.out.println("数组元素为：");
				if(arr[arr.length-1]==0) {
					//还未修改过数据
					dm.showData(arr, arr.length-1);
				}else {
					dm.showData(arr, arr.length);
				}
			}else {
				System.out.println("还未输入数据，请重新操作！");
			}
			break;
		case 3:
			int n, k;
			System.out.println("要插入的数据：");
			try {
			n = sc.nextInt();
			System.out.println("要插入的位置");
			k = sc.nextInt();
			}catch(java.util.InputMismatchException e){
				System.out.println("输入的数据有误，请重新输入！");
				sc.next();
				break;
			}
			dm.insertAtArray(arr, n, k);
			dm.showData(arr, arr.length);
			break;
		case 4:
			dm.divThree(arr);
			break;
		default:
			System.out.println("请输入正确的数字！");
		}
	   }
	
	}
}
