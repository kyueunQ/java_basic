package com.java.abstractTest;

public abstract class AbstractClass {

	int num;
	String str;
	
	public AbstractClass() {
		System.out.println("--Abstract Constructor--");
	}
	
	public AbstractClass(int n, String s) {
		System.out.println("--Abstract Constructor--");
	
	this.num = n;
	this.str = s;
	}
	
	
	public abstract void run();
	
}
