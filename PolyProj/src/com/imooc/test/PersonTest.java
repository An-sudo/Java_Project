package com.imooc.test;

import com.imooc.anonymous.*;

public class PersonTest {
	// 根据传入的不同的人的类型，调用对应的read方法
	// 方案一：
//	public void getRead(Man man) {
//		man.read();
//	}
//
//	public void getRead(Woman woman) {
//		woman.read();
//	}

//	//方案二：
//	public void getRead(Person person) {
//		person.read();
//	}
//	public static void main(String[] args) {
//		PersonTest test =new PersonTest();
//		Man one =new Man();
//		Woman two =new Woman();
//		test.getRead(one);
//		test.getRead(two);
//		
//	方案三：
	public void getRead(Person person) {
		person.read();
	}

	public static void main(String[] args) {
		PersonTest test = new PersonTest();
		
		test.getRead(new Person() {
			public void read() {
				System.out.println("男生喜欢看科幻书籍");
			}

		});
		test.getRead(new Person() {
			public void read() {
				System.out.println("女生喜欢读言情小说");
			}
		});

	}
}
