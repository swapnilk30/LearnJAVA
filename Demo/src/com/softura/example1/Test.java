package com.softura.example1;

public class Test {
	
	static int fun() {
		static int y=0;
		return  ++y;
	}

	public static void main(String[] args) {
		Derived derived=new Derived();
		derived.foo();
		
		System.out.println(fun());

	}

}
