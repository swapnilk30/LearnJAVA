/* Count the number of occurrences of a specific element in the a list using java8 features
Input List = “apple”, “banana”, “apple”, “orange”, “apple”
Count the occurrences of “apple” word in the given list
Output – the number of occurrences of apple are : 3
*/
package com.softura;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurrencesJava8 {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","apple","orange","apple");
		long count = words.stream().filter(word -> word.equals("apple")).count();
		System.out.println(count);
		//Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}

}
