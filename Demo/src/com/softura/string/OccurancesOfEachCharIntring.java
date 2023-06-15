package com.softura.string;

import java.util.HashMap;
import java.util.Map;
// write a java program to find occurances of each character in given string
public class OccurancesOfEachCharIntring {
	public static void main(String[] args) {
		String str="ilovejavatechi";
		char[] ch= str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}else {
				int cnt=map.get(c);
				map.put(c,cnt+1);
			}
		}System.out.println(map);
	}

}
