/*
 * using java 8
 * given two integer arrays firstArray and secondArray,return an array of their intersection .
each element in result must be unique and you may return the result in any array
Example : int firstArray={4,9,5};
		int secondArray[]={9,4,9,8,4};
		output : [9,4]
*/
package com.softura;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int firstArray[]= {4,9,5};
		int secondArray[]= {9,4,9,8,4};
		
		Arrays.stream(firstArray).filter(x->Arrays.stream(secondArray)
				.anyMatch(y->y==x))
					.distinct().forEach(System.out::println);
		
		
		
	}

}
