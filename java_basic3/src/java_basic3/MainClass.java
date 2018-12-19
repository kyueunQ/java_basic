package java_basic3;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Refrig re = new Refrig();
		re.color = "Pink";
		re.num = 100;
		re.price = 150;
		
		re.getInfo();
		re.getColor();
		
		
		Refrig re2 = new Refrig(150, 300);
		re2.getInfo();
		
		Refrig re3 = new Refrig("Bule", 400, 1000);
		re3.getInfo();
		
		re2 = null;
		re2.getInfo();
		
		// to use the object and method, write name(); to call it

		
	}

}
