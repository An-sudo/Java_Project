package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * public int read(byte[] b) 					从输入流中将最多b.length个字节的数据读入一个byte数组中
 * public int read (byte[] b,int off,int len) 	从输入流中将最多len个字节的数据读入byte数组中
 * */
public class FileInputDemo2 {
	public static void main(String[] args) {
		// 创建一个FileInputStream对象
		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
			byte[] b = new byte[100];
			fis.read(b, 0, 10);
			System.out.println(new String(b));
			fis.close();// 关闭输入流,节省资源
		} catch (FileNotFoundException e) { // FileNotFoundException是IOException的子类,需要放在父类的前面
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
