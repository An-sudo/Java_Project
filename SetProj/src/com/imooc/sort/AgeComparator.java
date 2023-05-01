package com.imooc.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		// 如果是降序排序
		// a2-a1
		
		// 按年龄进行升序排序
		int a1 = o1.getMonth();
		int a2 = o2.getMonth();
		int n = a1 - a2;
		return n;
	}

}
