package com.imooc.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileOutputDemo1 {
	public static void main(String[] args) {
		FileOutputStream fos;
		FileInputStream fis;
		try {
			fos = new FileOutputStream("/Users/ansmacbookpro/desktop/io/imooc.txt",true);
			fis = new FileInputStream("/Users/ansmacbookpro/desktop/io/imooc.txt");
			fos.write(50);//带true后面追加字符
			fos.write('a');
			System.out.println(fis.read());
			System.out.println((char) fis.read());
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
