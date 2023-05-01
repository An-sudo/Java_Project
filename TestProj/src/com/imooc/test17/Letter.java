package com.imooc.test17;

public class Letter implements Runnable {
	@Override
	public void run() {
		char n = 'a';
		for (int i = 0; i < 26; i++) {
//			char n1=(char)(n+i);
			System.out.print((char) (n + i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
