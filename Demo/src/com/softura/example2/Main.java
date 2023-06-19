package com.softura.example2;

public class Main {

	public static void main(String[] args) {
		try {
			throw 10;
			
		} catch (int e) {
			System.out.println("got the exception" + e);
		}

	}

}
