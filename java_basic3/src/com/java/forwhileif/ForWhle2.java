package com.java.forwhileif;

import java.util.Scanner;

public class ForWhle2 {
	
public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		int x = num.nextInt();
		System.out.printf("%d단을 알려줘\n", x);
		
		int i = 1;
		
		while (i<10) {
			System.out.printf("%d * %d = %d\n", x, i, (x * i));
		
			i++;
		}
		
	}

}
