package com.java.collections;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("Good");
		list.add("Morning");
		list.add("Everyone");
		// StringBuffer,StringBuilder: .append
		System.out.println("list size: " + list.size());
		System.out.println(list);
	
		// arranged by index
		list.add(2, "*");
		System.out.println(list);
		
		// Substitute
		list.set(2, "!");
		System.out.println(list);
	
		// getData
		// Declare datatype: <String> 
		String str = list.get(3);
		System.out.println(str);
		System.out.println(list + "\n");
		
		
		// remove();
		System.out.println("1.");
		System.out.println(list);
		list.remove(2);
		System.out.println("2 ");
		System.out.println(str);
		System.out.println(list);
		
		// clear();
		list.clear();
		System.out.println(list);
	
		list.add("oh!");
		boolean b = list.isEmpty();
		System.out.println(b);

		list.clear();
		boolean b1 = list.isEmpty();
		System.out.println(b1);
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		System.out.println(list2);
		list2.add(1, 2);
		System.out.println(list2);
		list2.add(1, 4);
		System.out.println(list2);
		list2.add(3, 3);
		System.out.println(list2);
	}
}
