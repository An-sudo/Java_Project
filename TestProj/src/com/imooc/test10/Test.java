package com.imooc.test10;

//测试类
public class Test {

  public static void main(String[] args) {
		//完成成员内部类内部测试
	  	
	  	BallTest li1=new BallTest();
	    //方式一
		BallTest.Inner_m one =new BallTest().new Inner_m();
		one.play();
		//方式二
		one=li1.new Inner_m();
		one.play();
		//方式三
		//通过get方法调用，由于BallTest里没有设置get方法所以这里就不写了
		
		//完成方法内部类测试
		BallTest two = new BallTest();
		two.Inner_f();
		
		//完成匿名内部类测试
		BallTest three = new BallTest() ;
		three.playBall(new BallTest() {
			public void play() {
				System.out.println("匿名内部类");
				System.out.println("打排球");
			}
		});
	}

}
