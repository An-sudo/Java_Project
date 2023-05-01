package com.imooc.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class StringSort{
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("orange");
		list.add("red");
		list.add("blue");
		list.add("black");
		list.add("green");
		System.out.print("排序前：");
		for(String s:list) {
			System.out.print(s+" ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.print("排序后：");
		for(String s:list) {
			System.out.print(s+" ");
		}
	}
}