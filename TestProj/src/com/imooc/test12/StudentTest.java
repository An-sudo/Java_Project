package com.imooc.test12;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {
	public static void main(String[] args) {
		Student one = new Student(3, "William", 65);
		Student two = new Student(1, "Tom", 87);
		Student three = new Student(2, "Lucy", 95);
		Student four = new Student(2, "Lucy", 95);
		Set set = new HashSet();
		set.add(one);
		set.add(two);
		set.add(three);
		set.add(four);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
