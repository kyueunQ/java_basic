package com.java.inheritance;

public class ChildClass extends ParentClass{
	
	String fatherName = "JiHo";
	
	public ChildClass() {
		System.out.println("--ChildClass Constructor--");
	}
	
	public void childTalk() {
		System.out.println("--chat chat--");
	}
	
	@Override
	public void smile() { //Override
		System.out.println("--HiHiHi--");
	}
	
	public void getFatherName() {
		System.out.println("Grandfather's Name: " + super.fatherName);
		System.out.println("My Father's Name: " + this.fatherName);
	}
	

}
