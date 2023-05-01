package com.Imooc.array;

public class SortDemo {
	public static void main(String[] args) {
		//冒泡排序
		int[] a= {34,53,12,32,56,17};
		System.out.println("排序前的数组：");
		for(int n:a) {
			System.out.print(n+",");//增强型for循环
		}
		System.out.println();
		//开始排序
		int temp;//中间变量
		
		//外重循环控制一共排列几趟
		for(int i=0;i<a.length-1;i++) {
		
			//内重循环控制每趟的排序
			for(int j=0;j<a.length-i-1;j++) { 
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("从小到大排序后的元素为");
		for(int n:a) {
			System.out.print(n+",");
		}
		
		
		
		
		
	}
}
