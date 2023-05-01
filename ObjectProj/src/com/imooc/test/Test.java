package com.imooc.test;//定义包
import com.imooc.animal.*;//加载com.imooc.animal下所有类
//import com.imooc.animal.Cat;//通过com.imooc.animal下指定的Cat类
//import com.imooc.*;
public class Test {
	public static void main(String[] args) {
		//com.imooc.mechanics.Cat one= new com.imooc.mechanics.Cat();
		Cat one=new Cat();
		CatTest two=new CatTest();
		// 直接加载com.imooc.animal.CatTest
		//com.imooc.animal.CatTest two =new com.imooc.animal.CatTest();
	}
}
