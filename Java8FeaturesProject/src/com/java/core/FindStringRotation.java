package com.java.core;

public class FindStringRotation {

	public static void main(String[] args) {
		String str1="ABCD";
		String str2="DABE";
		
		 if(findStringRotation(str1,str2)) {
			 System.out.println("rotation present");
		 }else {
			 System.out.println("rotation not present");
		 }
	}

	private static boolean findStringRotation(String str1, String str2) {
		return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2) !=-1);
		
		 
		
	}
}
