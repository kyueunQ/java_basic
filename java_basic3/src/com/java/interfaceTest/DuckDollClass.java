package com.java.interfaceTest;

public class DuckDollClass implements Duck {

	@Override
	public void walk() {
		System.out.println("cannot walk");
	}

	@Override
	public void fly() {
		System.out.println("cannot fly");
	}

	@Override
	public void sound() {
		System.out.println("BiiipBippip");
	}

	@Override
	public void swim() {
		System.out.println("can Float");
	}

}
