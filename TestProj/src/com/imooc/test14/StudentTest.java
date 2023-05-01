package com.imooc.test14;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class StudentTest implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// 按照名字进行升序排序
		String name1 = o1.getName();
		String name2 = o2.getName();
		int n = name1.compareTo(name2);
		return n;
	}

	public static void main(String[] args) {
		Student one=new Student("40","peter",20);
		Student two=new Student("28","angel",5);
		Student three=new Student("35","tom",18);
		
		List<Student> list = new ArrayList<Student>();
		list.add(one);
		list.add(two);
		list.add(three);
		System.out.println("按名字排序前：");
		for(Student a:list) {
			System.out.println(a);
		}
		Collections.sort(list,new StudentTest());
		System.out.println("按名字排序后：");
		for(Student a:list) {
			System.out.println(a);
		}
	}
}
