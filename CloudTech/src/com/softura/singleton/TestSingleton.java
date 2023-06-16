package com.softura.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonClass singletonClass1=SingletonClass.getInstance();
		SingletonClass singletonClass2=SingletonClass.getInstance();
		
		if(singletonClass1==singletonClass2) {
			System.out.println("Both  objects are same");
		}else {
			System.out.println("Both objects are different");
		}
	}
}
