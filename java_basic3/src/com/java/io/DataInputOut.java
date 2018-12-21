package com.java.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataInputOut {
	
	public static void main(String[] args) {
		
		String str = "Good Morning Everyone";
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
		
			// FileOutputStream으로 상위 OutputStream의 객체 생성
			os = new FileOutputStream("C:\\java\\pjt\\good.txt");
			// OutputStream을 매개변수로 사용한 DataOutputStream
			dos = new DataOutputStream(os);

			dos.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
