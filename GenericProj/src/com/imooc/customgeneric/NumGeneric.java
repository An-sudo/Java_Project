package com.imooc.customgeneric;

public class NumGeneric<T> {
	private T num;

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	// 测试
	public static void main(String[] args) {
		NumGeneric<Integer> intNum = new NumGeneric<>();
		intNum.setNum(10);
		System.out.println("Integer:" + intNum.getNum());
		NumGeneric<Double> douNum = new NumGeneric<>();
		douNum.setNum(32.9);
		System.out.println("Double:" + douNum.getNum());
	}
}
