package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMap {

	public static void main(String[] args) {
		
		List<Integer> ls=new ArrayList<>(Arrays.asList(12,34,46,25,30,30,18));
		long l=ls.stream().filter(i->i<=31).count();
		List<Integer> c=ls.stream().distinct().collect(Collectors.toList());
		List<Integer> c1=ls.stream().filter(i->i>=25).collect(Collectors.toList());
		List<Integer> s=ls.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(l);
	}
}
