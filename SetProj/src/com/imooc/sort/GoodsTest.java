package com.imooc.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GoodsTest {
	public static void main(String[] args) {
		Goods one = new Goods("S00001", "手机", 2000);
		Goods two = new Goods("S00002", "冰箱", 5000);
		Goods three = new Goods("S00003", "电视机", 6000);

		List<Goods> list = new ArrayList<Goods>();
		list.add(one);
		list.add(two);
		list.add(three);
		
		System.out.println("排序前：");
		for(Goods a:list) {
			System.out.println(a);
		}
		System.out.println("排序后：");
		Collections.sort(list);
		for(Goods a:list) {
			System.out.println(a);
		}
	}
}
