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
					
					// C:\\java\\pjt\\test.txt �ش� ������ 1byte�� ��� �о��
					data = ins.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				// ���̻� ���� ���� ���ٴ� ���� -1�� ǥ��
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
			
			// �а��� ����� ������ �߻� Ŭ�����κ��� ��ü�� ����
			InputStream ins2 = null;
			try {
				
				ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
				// FileInputStream ins2 = new FileInputStream("C:\\java\\pjt\\test.txt");
					
				
				int data2 = 0;
				// �Ű������� �迭 �ϳ��� ������
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
	
	
	
	
