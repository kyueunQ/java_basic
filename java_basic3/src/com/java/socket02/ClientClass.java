package com.java.socket02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
	
	public static void main(String[] args) {
		
		
		// 필요한 객체들을 선언
		Socket socket = null;
		
		OutputStream ops= null;
		DataOutputStream dops = null;
		
		InputStream ins = null;
		DataInputStream dins = null;
		
		Scanner sc = null;
		
		try {
			socket = new Socket("localhost", 9001);
			System.out.println("Connet the Server");
			
			ops = socket.getOutputStream();
			dops = new DataOutputStream(ops); // 확장
			
			ins = socket.getInputStream();
			dins = new DataInputStream(ins);
			
			sc = new Scanner(System.in);
			
			while (true) {
				System.out.println("메세지를 입력하세요: ");
				String outMessage = sc.nextLine();
				
				// 서버로 보내기
				dops.writeUTF(outMessage);
				dops.flush();
				
				// Server에서 들어온 말을 출력
				String inMessage = dins.readUTF();
				System.out.println("inMessage: " + inMessage);
				
				if(outMessage.equals("Strop")) break;
			}
				
		} catch (IOException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if(dops != null) dops.close();
				if(ops != null) ops.close();
				if(dins != null) dins.close();
				if(ins != null) ins.close();
				
				if(socket != null) socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
