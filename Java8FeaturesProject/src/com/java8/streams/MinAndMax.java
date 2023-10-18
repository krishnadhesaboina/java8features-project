package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMax {

	public static void main(String[] args) {
		
		List<Integer> ls=new ArrayList<>(Arrays.asList(54,25,65,76,23,43,57,87));
		
		Integer min=ls.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max=ls.stream().max((i1,i2)->i1.compareTo(i2)).get();
		Integer minDec=ls.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		Integer maxDec=ls.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(min);
		System.out.println(max);
		
		
		ls.stream().forEach(System.out::println);
		Integer [] arr=ls.stream().toArray(Integer[]::new);
		for(Integer i:arr) {
			//System.out.println(i);
		}
		
		Stream<Integer> sr=Stream.of(34,5,32,6);
		sr.forEach(System.out::println);
		
	}
}
