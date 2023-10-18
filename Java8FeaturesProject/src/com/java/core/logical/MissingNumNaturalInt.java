package com.java.core.logical;

public class MissingNumNaturalInt {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2,3, 4, 5, 6, 8 };

		int sum = (8 * (8+1)) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}

		System.out.println("Missing number in natural array is : " + (sum-actualSum));
	}
	
}
