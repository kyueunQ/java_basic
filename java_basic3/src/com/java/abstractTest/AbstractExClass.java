package com.java.abstractTest;

public class AbstractExClass extends AbstractClass{
	
	public AbstractExClass() {
		System.out.println("--AbstractExClass Constructor--");
	}
	
	public AbstractExClass(int n, String s) {
		super(n, s);
		
	}
	
	@Override
	public void run() {
		System.out.println("--Run fast--");
	}

}
