package com.imooc.test10;

//创建类BallTest
public class BallTest implements Ball {
  // 创建成员内部类Inner_m
	class Inner_m{
		public void play() {
			System.out.println("成员内部类");
			System.out.println("打篮球");
			System.out.println("***********");
		}
		
	}

	// 创建方法内部类
	public void Inner_f() {
		class a implements Ball{
			public void play() {
				System.out.println("方法内部类");
				System.out.println("打乒乓球");
				System.out.println("***********");
			}
		}
		a one =new a();
		one.play();
	}

	// 定义一个方法void playBall(Ball ball)，调用play()方法
	public void playBall(Ball ball) {
			ball.play();
	}

	@Override
	public void play() {
		
	}

	
	
}
