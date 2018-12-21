package com.java.abstractTest;

public abstract class AbstractClass {

	int num;
	String str;
	
	public AbstractClass() {
		System.out.println("--Abstract Constructor1--");
	}
	
	public AbstractClass(int n, String s) {
		System.out.println("--Abstract Constructor2--");
	
		this.num = n;
		this.str = s;
	}
	
	
	public abstract void run();
	
}
