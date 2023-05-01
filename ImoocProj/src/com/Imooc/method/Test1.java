package com.Imooc.method;

public class Test1 {
	public float ppp (float[] arr) {
		float sum=0f;
		float ping;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		ping =sum/arr.length;
			System.out.println(ping);
			return sum;
	}
	public static void main(String[] args) {
		float array[]= {78.5f,98.5f,65.5f,32.5f,75.5f};
		Test1 test = new Test1();
		test.ppp(array);
		System.out.println(test.ppp(array));
	}

}
