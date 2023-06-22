/* Find the sum of all the even numbers from the given array using java8 features
Input Array =1,2,3,4,5,6,7,8,9,10
Output=30
*/
package com.softura;

import java.util.Arrays;

public class SumEvenNumbersUsingJava8 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
		System.out.println(sum);
	}

}
