package com.java.interfaceTest;

public class InterfaceClass implements Interface01, Interface02 {

	public InterfaceClass() {
		System.out.println("--InterfaceClass Constructor--");
	
	}
	
	@Override
	public void smile() {
		System.out.println("--smile--");
	}

	@Override
	public void smile2() {
		System.out.println("--smile2--");
	}


}
