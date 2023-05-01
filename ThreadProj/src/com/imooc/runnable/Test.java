package com.imooc.runnable;

class PrintRunnable implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"正在运行！");
	}
	/* 由于在调用Runnable接口,该接口中只有一个run方法,所以调用名字并不能像继承Thread方法那样使用getName()
	 * 但是可以使用Thread中的一个静态方法currentThread()其中有getName()方法可以调用当前进程类的名称
	 * */
}
public class Test {
	public static void main(String[] args) {
		PrintRunnable pr= new PrintRunnable();
		Thread t = new Thread(pr);
		t.start();
		PrintRunnable pr1= new PrintRunnable();
		Thread t1 = new Thread(pr1);
		t1.start();
	}
}
