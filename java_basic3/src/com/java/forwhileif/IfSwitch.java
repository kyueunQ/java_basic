package com.java.forwhileif;
import java.util.Scanner;

public class IfSwitch {
	
public static void main(String[] args) {
		
		System.out.println("점수입력: ");
		
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		
		switch (sc1) {
		case 90:
			System.out.println("90점");
			break;
		case 80:
			System.out.println("80점");
			break;
		case 70:
			System.out.println("70점");
			break;
		case 60:
			System.out.println("60점");
			break;

		default:
			System.out.println("?");
			break;
		}
		
		
		sc.close();
		// resource 회수
		
	}
	
		
}
