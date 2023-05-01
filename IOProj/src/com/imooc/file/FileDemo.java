package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args)  {
		// 创建File对象
		File file1 = new File("/Users/yuchengan/Desktop/score");
		//File file2 =new File("/Users/ansmacbookpro/Desktop/");
		//File file3= new File(file2,"io/score.txt");
		String path;
		path = "/Users/ansmacbookpro/Desktop/io/";
		File file4 = new File(path);
		// 判断是文件还是目录
		System.out.println("是否是目录:" + file1.isDirectory());
		System.out.println("是否是文件:" + file1.isFile());

		System.out.println("是否为目录:" + file4.isDirectory());
		System.out.println("是否为文件:" + file4.isFile());

		//创建目录或创建多级目录
		File newFile= new File(path,"Hashset/set");
		if(!newFile.exists()) {
			newFile.mkdirs();
		}
		//创建文件
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
