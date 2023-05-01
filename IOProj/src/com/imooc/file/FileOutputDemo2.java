package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo2 {
	public static void main(String[] args) {
		// 文件拷贝
		try {
			FileInputStream fis = new FileInputStream("/Users/ansmacbookpro/desktop/io/TT.jpg");
			FileOutputStream fos = new FileOutputStream("/Users/ansmacbookpro/desktop/di/ttcopy.jpg");
			int n = 0;// 读方法的返回值
			byte[] b = new byte[1024];
			while ((n = fis.read(b)) != -1) {
				fos.write(b, 0, n);
			}
			 fis.close();
			 fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
