package com.java.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {
public static void main(String[] args) {
	
	String str="balakrishna";
	

	
	Map<Character, Integer> map=new HashMap<>();
	char[] ch=str.toCharArray();
	for(char c:ch) {
		if(!map.containsKey(c)) {
			map.put(c, 1);
		}else {
			//System.out.println(c);
			map.put(c, map.get(c)+1);
			//break;
		}
	}
	//System.out.println(map.get(c));
	System.out.println(map);
	//Iterator<String,String> it=map.entrySet().iterator();
	for(Entry<Character, Integer> et:map.entrySet()) {
		if (et.getValue()>1) {
			System.out.println(et.getKey());
			break;
		}
	}
		}
	
}

	
	

	
	
	
