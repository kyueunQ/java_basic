package com.java.array;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 1. 선언 후 초기화
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("arr[0]은" + arr[0]);
		System.out.println("arr[1]은" + arr[1]);
		System.out.println("arr[2]는" + arr[2]);
		
		
		// 2. 선언과 초기화를 동시에 
		int[] arr02 = {4, 5, 6};
		
		System.out.println("arr02[0]은" + arr02[0]);
		System.out.println("arr02[1]은" + arr02[1]);
		System.out.println("arr02[2]는" + arr02[2]);
		
	}
	

}
