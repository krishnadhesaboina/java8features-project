package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class IntermediatAndTerminal {

	public static void main(String[] args) {
		
		List<String> laptopList =new ArrayList<>();
		laptopList.add("Dell");
		laptopList.add("Acer");
		laptopList.add("Lenovo");
		laptopList.add("Apple");
		laptopList.add("Hp");
		
		//intermediat operator is sort
		laptopList.sort((a1,a2)->a1.compareTo(a2));
		 
		//terminal operator is forEach
		laptopList.forEach(a->System.out.println(a));
		
	}
}
