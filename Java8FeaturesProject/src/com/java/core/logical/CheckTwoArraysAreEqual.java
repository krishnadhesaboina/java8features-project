package com.java.core.logical;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckTwoArraysAreEqual {

	public static void main(String[] args) {
		
	int [] arr1= {4,8,2,6};
	int [] arr2= {2,4,6,8};

	if(areArraysEqual(arr1,arr2)) {
		System.out.println("both are equal");
	}else {
		System.out.println("both are not equal");
	}
	
	
	}
static boolean areArraysEqual(int[] ar1,int [] ar2){
	Arrays.sort(ar1);
	Arrays.sort(ar2);
if(ar1.length != ar2.length) {
	return false;
}
	for(int i=0; i<ar1.length;i++) {
		if(ar1[i]!=ar2[i]) {
			return false;
		}
	}

		
		return true;
	}
}
