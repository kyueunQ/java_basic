package com.java.string;

public class StringClass {
	
	public static void main(String[] args) {
		
		String str = "Hello";
		// String str = new String("HELLO");
		System.out.println(str);
		
		str = str + "-Bye!";
		System.out.println(str);
		
		// StringBuffer
		StringBuffer sf = new StringBuffer("Hello");
		System.out.println(sf);
		
		// append()
		sf.append("-Bye");
		System.out.println(sf);
		System.out.println(sf.length());
		
		// insert(starting point, string)
		sf.insert(sf.length(), "!!!");
		System.out.println(sf);
		sf.insert(5, "*");
		System.out.println(sf);
		
		// delete
		sf.delete(6, 10);
		System.out.println(sf);
		
		// StringBuilder
		StringBuilder sb = new StringBuilder("Hello Bye");
		System.out.println(sb);
	}
	

}
