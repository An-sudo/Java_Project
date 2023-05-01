package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

			/*
			 * public int read() 从输入流中读取一个数据字节
			 * */
public class FileInputDemo1 {
	public static void main(String[] args) {
		// 创建一个FileInputStream对象

		try {
			FileInputStream fis = new FileInputStream("imooc.txt");
			// int n=fis.read();
			
			// 方法一 int n =fis.read();
			// while(n!=-1) {
			// System.out.print((char)n);
			// n=fis.read();
			// }
			// 方法二
			int n = 0;
			while ((n = fis.read()) != -1) {
				System.out.print((char) n);
			}
			System.out.println((char) n);
			fis.close();// 关闭输入流,节省资源
		} catch (FileNotFoundException e) { // FileNotFoundException是IOException的子类,需要放在父类的前面
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
