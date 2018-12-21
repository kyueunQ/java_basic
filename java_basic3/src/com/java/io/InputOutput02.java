package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputOutput02 {
	
	public InputOutput02() {
	
		// write()
		OutputStream os = null;
		try {
			
			// �ش� ������ ������ ������ �Ϳ� ����
			// �ش� ������ ������ ���� ������
			os = new FileOutputStream("C:\\java\\pjt\\test2.txt");
			String data = "Good Morning Everyone*";
			byte[] arr = data.getBytes();
			
			try {
				os.write(arr);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(os != null) os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// write(
		OutputStream os2 = null;
		try {
			
			// �ش� ������ ������ ������ �Ϳ� ����
			// �ش� ������ ������ ���� ������
			os2 = new FileOutputStream("C:\\java\\pjt\\test2.txt");
			String data2 = "Good Morning Everyone*";
			byte[] arr2 = data2.getBytes();
			
			try {
				os2.write(arr2, 0, 5);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(os != null) os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
