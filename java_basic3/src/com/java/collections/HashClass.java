package com.java.collections;

import java.util.HashMap;

public class HashClass {
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// <key, value>
		// map : reference parameter

		map.put(2, "A");
		map.put(3, "C");
		map.put(4, "D");
		System.out.println(map);
		System.out.println(map.size());
	
		// Substitute
		map.put(2, "B");
		System.out.println(map);
	
		// getData
		String str = map.get(2);
		System.out.println(str);

	
		// removeData
		map.remove(2);
		System.out.println(map);

		// contain data or not
		boolean b = map.containsKey(3);
		System.out.println("contain '3' in Key?: " +b);
	
		b = map.containsValue("A");
		System.out.println("contain 'A' in Value?: " + b);
		
		//remove all data
		map.clear();
		System.out.println(map);
		
		// empty?
		b = map.isEmpty();
		System.out.println(b);
	}

}
