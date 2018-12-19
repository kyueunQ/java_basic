package com.java.test;

public class Atm {
	
	public static void main(String[] args) {
		
		CoupleAccount w = new CoupleAccount("W");
		// save the name (create W's card)
		w.saveMoney(10000);
		w.getInfo();
		
		CoupleAccount m = new CoupleAccount("M");
		// (create M's card)
		m.saveMoney(10000);
		m.getInfo();
		
		w.spendMoney(3000);
		m.spendMoney(2000);
		
	}

}
