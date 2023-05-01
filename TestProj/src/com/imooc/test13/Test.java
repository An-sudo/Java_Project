package com.imooc.test13;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
public class Test {
	public static void main(String[] args) {
		Map<String,String> football=new HashMap<String,String>();
		football.put("2014", "德国");
		football.put("2010", "西班牙");
		football.put("2006", "意大利");
		
		Iterator it= football.values().iterator();
		System.out.println("使用迭代器进行输出：");
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
		}
		
		System.out.println();
		System.out.println("使用EntrySet进行输出：");
		
		Set<Entry<String ,String>> aaa= football.entrySet();
		for(Entry<String,String>bbb:aaa) {
			System.out.println(bbb.getKey()+"-"+bbb.getValue());
			
		}

	}
}
