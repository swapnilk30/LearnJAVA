package com.softura;
// How to check if the given number is prime or not
public class CheckPrimeNumber {
	
	public static void main(String[] args) {
	
		int num=2;
		boolean isPrime=true;
		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number");
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num + " is not a prime number");
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime number");
		}
	}

}
