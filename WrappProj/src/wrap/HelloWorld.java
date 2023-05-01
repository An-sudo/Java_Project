package wrap;

public class HelloWorld {
	public static void main(String[] args) {
		int score=100;
		Integer score1=new Integer(score);
		double t1=score1.intValue();
		long t2=score1.intValue();
		int t3=score1.intValue();
		System.out.println("score对应的Integer类型结果为："+score1);
		System.out.println("score对应的double类型结果为："+t1);
		System.out.println("score对应的long类型结果为："+t2);
		System.out.println("重新由Integer转换为int类型的结果为："+t3);
		
	}
}
