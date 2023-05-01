package com.imooc.priority;
class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}
	
	public void run () {
		for(int i=1;i<=150;i++) {
			System.out.println("线程"+name+"正在运行"+i);
//			try{Thread.sleep(500);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
	}
}
public class PriorityDemo {
	public static void main(String[] args) {
		//获取主线程的优先级
		int priority = Thread.currentThread().getPriority();
		System.out.println("主线程的优先级为"+priority);
		MyThread mt=new MyThread("线程1");
		MyThread mt2=new MyThread("线程2");
//		mt.setPriority(10);   与下面的代码意义一样
		mt.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.MIN_PRIORITY);
		
		mt2.start();
		mt.start();
		
//		System.out.println("线程1的优先级为:"+mt.getPriority());
	}
}
