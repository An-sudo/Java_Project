package com.imooc.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("imooc.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			FileInputStream fis = new FileInputStream("imooc.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			bos.write(50);
			bos.write('a');
			bos.flush(); // 强制清空缓冲区
			System.out.println(bis.read());
			System.out.println((char) bis.read());
			System.out.println(System.currentTimeMillis());//long型 当前时间减去1970.1.1
			fos.close(); // close()也能强制清空缓冲区
			fis.close();
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
