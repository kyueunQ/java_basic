package com.java.forwhileif;

import java.util.Scanner;

public class ForWhile {
	
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		System.out.printf("%d���� �˷���\n", x);
		
		for (int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", x, i, (x * i));
		}
		
	}

}
