package com.java.inheritance;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass chi = new ChildClass();
		
		chi.childTalk();
		chi.parentListen();
		chi.smile();
		
		
		ParentClass[] arr = new ParentClass[2];
		
		ParentClass child1 = new ChildClass();
		ParentClass child2 = new ChildClass2();

		arr[0] = child1;
		arr[1] = child2;
		
		
		ChildClass chiiii = new ChildClass();
		chiiii.getFatherName();
		

		// anonymous class
		new ChildClass() {  // create Object
			
			@Override
			public void smile() {
				System.out.println("HahaHoho");
			};	
		
		}.smile();
		
	}
	
}
