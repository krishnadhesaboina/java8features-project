package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDefaultAndCustom {

	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<>(Arrays.asList(56,72,34,25,48,19,58));
		System.out.println(ls);
		List<Integer> sortList=ls.stream().sorted().collect(Collectors.toList());
		
		List<Integer> sortList1=ls.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		
		List<Integer> sortList2=ls.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println(sortList2);

		List<String> lsNames=new ArrayList<>(Arrays.asList("Bala","Nikki", "Chai","Bhuvan","Naveen","Mani"));
		
		List<String> sortNames=lsNames.stream().sorted().collect(Collectors.toList());
		
		List<String> sortNames1=lsNames.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		
		
		Comparator<String> com = (s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			
			if(l1<l2) return -1;
			else if(l1>l2) return +1;
			else return s1.compareTo(s2);
		};
		List<String> sortNames2=lsNames.stream().sorted(com).collect(Collectors.toList());
		System.out.println(sortNames2);
		
	}
}
