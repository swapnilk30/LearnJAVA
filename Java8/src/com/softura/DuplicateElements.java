package com.softura;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// write java program to find all duplicate element from a given string."ilovejavatechie"
public class DuplicateElements {

	public static void main(String[] args) {
		String str="ilovejavatechie";
		String[] stringArray = str.split("");
		Stream<String> stream = Arrays.stream(stringArray);
		Map<String, Long> collect = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}
}
