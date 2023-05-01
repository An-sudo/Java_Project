package com.imooc.sort;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class IntSort {
	public static void main(String[] args) {
		//对存储在List中的整型数据进行排序
		List<Integer> list =new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(1);
		
		System.out.print("排序前：");
		for(int n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
		//对list中的数据进行排序
		Collections.sort(list);
		System.out.print("排序后：");
		for(int n:list) {
			System.out.print(n+" ");
		}
		
	}
}
