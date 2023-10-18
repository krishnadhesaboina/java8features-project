package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurence {

	public static void main(String[] args) {

		String input = "balakrishna";

		/* find each char occurence in string */
		Map<String, Long> map = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Character, Long> map1 = input.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);

		
		
		/* find all duplicate elements in a given string */

		Map<Character, Long> duplicateMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		List<Character> duplicateElements = duplicateMap.entrySet().stream().filter(x -> x.getValue() == 1)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElements);

		
		
		/* find unique elements in given string */
		Map<String, Long> duplicateCount = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//List<String> dupliElemets=	duplicateCount.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		duplicateCount.forEach((entry, count) -> {
			if (count == 1)
				System.out.print(" chars : " + entry);
		});

		
		/* */
	}

}
