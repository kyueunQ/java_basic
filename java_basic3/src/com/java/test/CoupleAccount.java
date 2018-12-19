package com.java.test;

public class CoupleAccount {

	private String name;
	static int amount;
	// static: share the data with all objects
	
	public CoupleAccount(String name) {
		this.name = name;
	}
	
	public void saveMoney (int money) {
		
		amount += money;
		System.out.println("===================");
		System.out.println("amount: " + amount);

	}
	
	public void spendMoney (int money) {
		
		amount -= money;
		System.out.println("===================");
		System.out.println("amount: " + amount);
		
	}
	
	public void getInfo() {
		
		System.out.println("----------");
		System.out.println("user: " + name);
		System.out.println("amount: " + amount);
		
	}

	
}
