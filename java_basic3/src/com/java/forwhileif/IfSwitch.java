package com.java.forwhileif;
import java.util.Scanner;

public class IfSwitch {
	
public static void main(String[] args) {
		
		System.out.println("�����Է�: ");
		
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		
		switch (sc1) {
		case 90:
			System.out.println("90��");
			break;
		case 80:
			System.out.println("80��");
			break;
		case 70:
			System.out.println("70��");
			break;
		case 60:
			System.out.println("60��");
			break;

		default:
			System.out.println("?");
			break;
		}
		
		
		sc.close();
		// resource ȸ��
		
	}
	
		
}
