package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputOutput {
	
	public static void main(String[] args) {
		
		InputStream ins = null;
		
		try {
			
			ins = new FileInputStream("C:\\java\\pjt\\test.txt");
			int data = 0;
			
			while(true) {
				
				try {
					
					// C:\\java\\pjt\\test.txt 해당 파일을 1byte씩 모두 읽어옴
					data = ins.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				// 더이상 읽을 것이 없다는 것을 -1로 표시
				if (data == -1) break;
				System.out.println("data :" + data);
				
			} 
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} finally {
				try {
					if(ins != null) ins.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		
		// read(byte[])
			
			// 읽고쓰는 기능을 쓰고자 추상 클래스로부터 객체를 생성
			InputStream ins2 = null;
			try {
				
				ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
				// FileInputStream ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
					
				
				int data2 = 0;
				// 매개변수로 배열 하나를 선언함
				byte[] by = new byte[3];
				
				while(true) {
					
					try {
						data2 = ins2.read(by);
					} catch (IOException e){
						e.printStackTrace();
					} 
					if(data2 == -1) break;
					System.out.println("data :" + data2);
					for (int i = 0; i < by.length; i++) {
						System.out.println("bs[" + i + "] : " + by[i]);
					}
				}	
					
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
						
	}
}
	
	
	
	
