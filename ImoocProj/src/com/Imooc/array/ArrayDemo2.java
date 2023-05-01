package com.Imooc.array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//求数组元素的最大值
		int[] a= {77,100,78,56,99};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			} 
		}
		System.out.println(max);
		
	}
}
