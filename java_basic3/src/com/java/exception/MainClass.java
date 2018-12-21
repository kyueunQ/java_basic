package com.java.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int x = 100;
		int y = 0;
		int z = 0;
		int i;
		
		System.out.println("Here");
		
		
		try {
			
			// 예외가 발생할 것 같은 부분을 적기
			z = x / y;
			i = x + y;
			
		} catch (Exception e) {
			
			// 어떤 예외가 발생했는지 console에 출력
			e.printStackTrace();
			// 예외를 간략하게 문자로 받아옴
			String msg = e.getMessage();
			
			System.out.println("Exception :" + msg);
		} finally {
			i = x + y;
			System.out.println(i);
		}
	
		System.out.println("Here?!");
		
	}
	
	

}
