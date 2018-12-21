package com.java.object;

public class Bike {
	
    public String color;
    public int num;
    public int price;
    
    public Bike() {
    	System.out.println("constructor");
	}
    
    public Bike(String c, int p) {
    	System.out.println("constructor2");
    	this.color = c;
    	this.price = p;
    
    } // 생성자를 여러개 만들 수 있음
    
    public void info() {
    	System.out.println("--info--");
    	System.out.println("color: " + color);
    	System.out.println("price: " + price);
    	
    }
    
    public void run() {
    	System.out.println("달린다");
    }
    public void stop() {
    	System.out.println("멈춘다");
    }

}
