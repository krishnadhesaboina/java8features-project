package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.model.Employee;

public class GroupingByAge {

	public static void main(String[] args) {
		
		List<Employee> empList=new ArrayList<Employee>(Arrays.asList(new Employee(101,"bala",24,"tech",20000), new Employee(102, "nikki", 23, "aggri", 28000),
				new Employee(103, "joy", 28, "je", 30000),new Employee(104,"krish",24,"do",18000),new Employee(105,"nain",23,"mech",35000)));
	
		//using streams
	Map<Integer, Long> groupByAge= empList.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
		
	System.out.println(groupByAge);
	
	
	//using map
	
	Map<Integer, Integer> map=new HashMap<>();
	
	for(Employee e:empList) {
		if(!map.containsKey(e.getAge())) {
			map.put(e.getAge(), 1);
		}else {
			map.put(e.getAge(), map.get(e.getAge())+1);
		}
	}
	System.out.println(map);
	
	}
}
