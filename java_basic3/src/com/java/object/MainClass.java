package com.java.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		Bike mybic = new Bike();
		// �޸𸮻� ��ü ������
		mybic.color = "blue";
		mybic.price = 500;
		
		mybic.run();
		mybic.stop();
		mybic.info();
		
		System.out.println("---------------------");		
		
		
		Bike mybic2 = new Bike("yellow", 900);
		/* mybic2.color = "yellow";
		mybic2.price = 800; */
		mybic2.info();

		mybic2.color = "red";
		mybic2.info();
		
			
		
	}
	
	
	
}
