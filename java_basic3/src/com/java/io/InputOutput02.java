package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputOutput02 {
	
	public InputOutput02() {
	
		// write()
		OutputStream os = null;
		try {
			
			// 해당 파일이 있으면 기존의 것에 쓰고
			// 해당 파일이 없으면 새로 생성함
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
			
			// 해당 파일이 있으면 기존의 것에 쓰고
			// 해당 파일이 없으면 새로 생성함
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
