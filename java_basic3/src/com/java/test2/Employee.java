package com.java.test2;

public class Employee {
	
	private String name;
	private String job;
	private int year;
	private int salary;
	
	public Employee(String n, String j, int y, int sal) {
		
		this.name = n;
		this.job = j;
		this.year = y;
		this.salary = sal;
	
	}

	/*
	private void Employee(String n, String j, int y) {
		this.name = n;
		this.job = j;
		this.year = y;
		
	} */  //
	
	public void getInfo() {
		System.out.println("name: " + this.name);
		System.out.println("job: " + job);
		System.out.println("year: " + year);
		System.out.println("salary: " + salary);
	}
	
	
	
	// public으로 선언
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	// 이름의 경우 절대 변경하지 못하게 하고 싶을 경우 위의 부분을 지우기

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1) {
			this.year = year;
		}
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if (salary < 10000) {
		this.year = salary;
		} else {
			System.out.println("seriously?");
		}
	}
	
	

}
