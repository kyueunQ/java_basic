package com.java.abstractTest;

public class AbstractMainClass {

	
		public static void main(String[] args) {
			
			AbstractClass ab = new AbstractExClass(100, "ha");
			// AbstractExClass ab = new AbstractExClass(100, "ha");
			
			ab.run();
		}
}
