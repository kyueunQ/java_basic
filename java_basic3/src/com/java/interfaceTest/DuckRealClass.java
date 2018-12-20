package com.java.interfaceTest;

public class DuckRealClass implements Duck {

	@Override
	public void walk() {
		System.out.println("can Walk");
		
	}

	@Override
	public void fly() {
		System.out.println("can Fly");
	}

	@Override
	public void sound() {
		System.out.println("KKuKuGaadd");
	}

	@Override
	public void swim() {
		System.out.println("can Swim");
	}

}
