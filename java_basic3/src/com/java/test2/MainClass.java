package com.java.test2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Employee em = new Employee("Jane", "Sales", 3, 5000);
		em.getInfo();
	
	
		em.setJob("Manufacturing");
		em.getInfo();
	
		em.setYear(0);
		em.getInfo();
		
		em.setSalary(11000);
		em.getInfo();
	}
	
	

}
