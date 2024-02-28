package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.model.Student;

public class StudentEx {

	
	public static void main(String[] args) {
		
		List<Student> ls=Arrays.asList(new Student(101, "bala", 65, "science"),new Student(102, "krish", 78, "Arts"),new Student(103, "joy", 90, "science"),
				new Student(104, "naveen", 72, "science"),new Student(105, "nikki", 69, "agri")); 
		
	List<String> name=	ls.stream().filter(s->s.getPercentage()>70 && s.getStream().equals("science")).map(s->s.getName()).collect(Collectors.toList());
//List<String> names=	name.stream().filter(s->s.getStream().equals("science")).map(s->s.getName()).collect(Collectors.toList());
	System.out.println(name);
	
	
	}
}
