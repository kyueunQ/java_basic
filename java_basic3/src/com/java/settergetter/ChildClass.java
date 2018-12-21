package com.java.settergetter;

public class ChildClass {

	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("==ChildClass constructor==");
	}
		
	
	public void setInfo(String n, String g, int a) {
		System.out.println("--setInfo()--");

		name = n;
		gender = g;
		age = a;
	
	}
	
	public void getInfo() {
		System.out.println("--getInfo--");
		System.out.println("name: " + name);
		System.out.println("genger: " + gender);
		System.out.println("age: " + age);
	
		secret(); //내부 호출은 가능
	}
	
	private void secret() {
		System.out.println("--비밀--");
	}
	
}
