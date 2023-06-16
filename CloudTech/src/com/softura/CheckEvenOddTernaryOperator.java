package com.softura;
// How to check if the given number is even or odd using ternary operator
public class CheckEvenOddTernaryOperator {

	public static void main(String[] args) {
		int input =13;
		String result = input %2 ==0 ? "Even":"Odd";
		System.out.println(input + " is a "+ result);
	}
}
