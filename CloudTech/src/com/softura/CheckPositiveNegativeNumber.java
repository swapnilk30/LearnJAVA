package com.softura;

import java.util.Scanner;

// Check if the given number is positive or negative or zero
public class CheckPositiveNegativeNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();
		if (input>0) {
			System.out.println("the number is positive");
		}else if(input<0) {
			System.out.println("the number is Negative");
		}else {
			System.out.println("the number is zero");
		}
	}

}
