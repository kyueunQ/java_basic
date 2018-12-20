package com.java.lambda;

public class MainClass {
	
	public static void main(String[] args) {
		
		// InterfaceA
		InterfaceA Ia = (String a, String b, String c) -> { System.out.println(a+ " " + b + " " + c); };
		Ia.greeting("Good", "Good", "Morning");

		
		// InterfaceB
		InterfaceB Ib = (a) -> { System.out.println(a); };
		Ib.greeting("Morning");
		
		
		// InterfaceB_2
		InterfaceB Ib2 = a -> System.out.println(a);
		Ib.greeting("Morning");

		
		// Interface3
		InterfaceC Ic = () -> System.out.println("no parameter");
		Ic.greeting();
		
		// return lambda
		InterfaceD Id = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("Id.cal: %d\n", Id.cal(100, 150));
		
		
		Id = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("Id.cal: %d\t", Id.cal(100, 150));
	
		
		Id = (x, y) -> {
			int result = (10*x) - y;
			return result;
		};
		System.out.printf("Id.cal: %d\n", Id.cal(100, 150));
	}
	

}


