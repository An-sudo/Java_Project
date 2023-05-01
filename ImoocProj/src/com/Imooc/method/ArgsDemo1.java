package com.Imooc.method;

public class ArgsDemo1 {
	//查找
	public void search(int n,int...a) {
		boolean flag= false;
		for(int a1:a) {
			if(a1==n) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了！"+n);
		}else {
		System.out.println("没找到！"+n);
		}
	}
	
	
	public static void main(String[] args) {
		ArgsDemo1 argsDemo1=new ArgsDemo1();
		int arr[]= {1,2,3,4,5,6,7};
		argsDemo1.search(9,arr);
		
	}
}
