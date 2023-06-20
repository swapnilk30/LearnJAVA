/* remove duplicate characters from string
 * input : programming
 * output : poraming
 * using java8/ using indexof()/ character array / using set interface*/
package com.softura.string;

public class RemoveDuplChars {
	
	public static void main(String[] args) {
		String str="programming";
		//aproach-1
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
	}
	
	

}
