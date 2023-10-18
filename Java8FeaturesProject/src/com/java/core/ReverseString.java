package com.java.core;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="BalakrishnA";
		
		
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
		int arr[]= {2,4,8,4,0,6};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
		}
		
	}
		System.out.println(arr);
}}
