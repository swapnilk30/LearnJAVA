package com.softura.map;

import java.util.HashMap;
import java.util.Map;

public class MapCrud {
	
	public static void main(String[] args) {
		// Create a map of generic type.
		Map<Integer,String> map=new HashMap<>();
		// Checking map is empty or not.
		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);
		// Adding entries in the map. Call put() method to add entries in map.
		map.put(1, "swapnil");
		map.put(2, "vaibhav");
		map.put(3, "pramod");
		map.put(4, "megha");
		System.out.println(map);
		int size =map.size();
		System.out.println(size);
		// Create another map.
		Map<Integer, String> map2=new HashMap<>();
		map2.put(5, "anurath");
		map2.put(6, null);
		map2.put(7, null);
		System.out.println(map2);
		// Inserting elements of map2 into map.
		map.putAll(map2);
		System.out.println(map);
		
		//2. Removing entries:
		// Removing an entry for the specified key.
		map.remove(7);
		System.out.println(map);
		// Removing specified value associated with the specified key from the map.
		map.remove(6, null);
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
	}

}
