package com.java.core;

public class SpecialCharFound {
	
	public static void main(String[] args) {
		
		String s="balua@12$$$3%";
		int count=0;
		String removedSpecChar="";
		for(int i=0; i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				count++;
			}else {
				removedSpecChar =removedSpecChar+s.charAt(i);
			}
		}
		if(count==0) {
		System.out.println("Special chars not found ");
		}else {
			System.out.println("Special chars  found "+ count);

		}
		System.out.println(removedSpecChar);
	}

	

}
