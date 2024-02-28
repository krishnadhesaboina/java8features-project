package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		// List<String> dupliElemets=
		// duplicateCount.entrySet().stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		duplicateCount.forEach((entry, count) -> {
			if (count == 1)
				System.out.print(" chars : " + entry);
		});

		/* find first non repeat char in given string */
		System.out.println();
		Map<Character, Long> countMap = input.chars().mapToObj(m -> (char) m)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Character firstnonRepeatChar = countMap.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get()
				.getKey();
		System.out.println(" fist non repeate char : " + firstnonRepeatChar);

		/* find first repeated char in given string */
		System.out.println();
		Map<Character, Long> countofMap = input.chars().mapToObj(m -> (char) m)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		Character firstRepeatedChar = countofMap.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get()
				.getKey();
		System.out.println(" fist repeated char : " + firstRepeatedChar);

		// find second highest num
		int[] arr = { 25, 12, 43, 56, 32, 29 };

		Integer secondHighnum = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighnum);

		/** find longest string in a given string array **/
		String[] str = { "bala", "krishna", "jai" };
		String longString = Arrays.stream(str).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println(longString);

		/** find element in an array who starts with 1 **/

		int[] inputArr = { 36, 12, 6, 34, 15, 1 };
		List<String> st = Arrays.stream(inputArr).boxed().map(s -> s + "").filter(x -> x.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(st);

		/** string.join method **/

		List<String> s = Arrays.asList("3", "12", "1", "45");
		String result = String.join("-", s);
		System.out.println(result);

		/** skip and limit example , print (2-9) **/
		IntStream.rangeClosed(1, 10).skip(3).limit(4).forEach(System.out::print);

	}

}
