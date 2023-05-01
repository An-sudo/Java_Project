package com.imooc.join;

class MyThread implements Runnable {
	@Override 
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println(Thread.currentThread().getName()+"正在执行第"+i+"次");
		try{
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		Thread t1 = new Thread();

		t.start();
		try {
			t.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=20;i++) {
			System.out.println("主线程运行第"+i+"次");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generaed catch block
				e.printStackTrace();
			}
		}
		System.out.println("主线程运行结束！");

	}
}
