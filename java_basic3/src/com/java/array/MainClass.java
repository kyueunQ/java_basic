package com.java.array;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: "); int a = sc.nextInt();
		System.out.println("이름을 입력하세요: "); String b = sc.next();
		
		System.out.printf("오늘 날씨는 %5d도 입니다.", a);
		// 오른쪽 정렬
		System.out.printf("%s님 회원가입을 축하드립니다.", b);

		
		
		
	}

}


