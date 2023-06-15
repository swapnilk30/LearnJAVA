package com.softura;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// java program to count the occurance of each character in string."ilovejavatechie"
public class OccuranceOfEachChar {
	public static void main(String[] args) {
		String str="ilovejavatechie";
		String[] result = str.split("");
		Stream<String> stream = Arrays.stream(result);
		//Map<String, List<String>> collect = stream.collect(Collectors.groupingBy(s->s));
		//System.out.println(collect);
		Map<String, Long> collect = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}
	

}
