package com.java.interfaceTest;

public class DuckMainClass {
	
	public static void main(String[] args) {
		Duck doll = new DuckDollClass();
		Duck real = new DuckRealClass();
		
		Duck ducks[] = {doll, real};
		//DataType: Duck
		
		for(int i = 0; i < ducks.length; i++) {
			ducks[i].fly();
			ducks[i].sound();
			ducks[i].swim();
			ducks[i].walk();
			
			System.out.println();
			
		}
		
	}

}
