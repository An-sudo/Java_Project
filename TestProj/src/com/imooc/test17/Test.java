package com.imooc.test17;

public class Test {
	public static void main(String[] args) {

		Letter l = new Letter();
		Thread t = new Thread(l);
		t.start();

	}
}
