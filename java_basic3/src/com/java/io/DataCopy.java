package com.java.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataCopy {
	
	public static void main(String[] args) {
		
		InputStream ins = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		System.out.println("A");
		
		try {
			
			ins = new FileInputStream("C:\\java\\pjt\\test.txt");
			// 문자 단위로 읽기 위해서
			dis = new DataInputStream(ins);
			
			String str = dis.readUTF();
			
			os = new FileOutputStream("C:\\java\\pjt\\good.txt");
			dos = new DataOutputStream(os);

			System.out.println("B");
			
			dos.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(os != null) os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
			
	}

}
