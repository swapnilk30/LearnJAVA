package com.softura;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	
	public static void main(String[] args) {
		String str="hello";
		String[] s = str.split("");
		Stream<String> st = Arrays.stream(s);
		Map<String, Long> c= st.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	
		
	}

}
