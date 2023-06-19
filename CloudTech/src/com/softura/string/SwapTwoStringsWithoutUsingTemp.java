package com.softura.string;
// java program to swap two strings without using temp varaible
// input:before swappnig  string s1="cloud",string s2="tech";
//output :after swapping string s1="tech", string s2="cloud";
public class SwapTwoStringsWithoutUsingTemp {

	public static void main(String[] args) {
		String s1="cloud";
		String s2="tech";
		System.out.println("before swaping: "+s1+" "+s2);
		s1=s1+s2;//cloudtech
		s2=s1.substring(0,(s1.length()-s2.length()));//cloud
		s1=s1.substring(s2.length());
		System.out.println("after swaping: "+s1+" "+s2);
	}
}
