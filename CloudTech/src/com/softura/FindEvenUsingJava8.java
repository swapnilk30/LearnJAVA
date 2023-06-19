/* Given a list of integer,find all the even numbers using java8 stream 
Even number : Ant number is completely divisible by 2 is even number
10 % 2 == 0 -> even number
input : 1,2,3,4,5,6
output: 2,4,6
*/
package com.softura;

import java.util.Arrays;
import java.util.List;


public class FindEvenUsingJava8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.stream().filter(n->n%2==0).forEach(System.out::println);// even number
		list.stream().filter(n->n%2==1).forEach(System.out::println);// odd number
		
	}

}
