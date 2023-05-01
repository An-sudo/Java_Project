package com.imooc.path;

import java.io.File;
import java.io.IOException;
public class PathDemo {
	public static void main(String[] args) {
		File f= new File("thread.txt");
		try{
			f.createNewFile();//新建thread.txt到工程目录下,FileProj文件夹下
			System.out.println(f.isAbsolute());//判断是绝对路径相对路径,返回值true为绝对路径,false为相对路径.
			System.out.println(f.getPath());//获取相对路径
			System.out.println(f.getAbsolutePath());//获取绝对路径
			System.out.println(f.getName());//获取文件名
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());//文件是否存在
		
		
	}
}
