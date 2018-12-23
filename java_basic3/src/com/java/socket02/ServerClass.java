package com.java.socket02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream ins = null;
		DataInputStream dins = null;
		
		OutputStream ops= null;
		DataOutputStream dops = null;
		
		try {
			
			serverSocket = new ServerSocket(9001);
			System.out.println("Complete. Welcome!");
			
			// outMessage가 오면 여기서 반응
			socket = serverSocket.accept();
			System.out.println("Successfully Connect the client");
			System.out.println("socket: " + socket);
			
			ins = socket.getInputStream();
			dins = new DataInputStream(ins);
			
			ops = socket.getOutputStream();
			dops = new DataOutputStream(ops);
			
			while (true) {
				// client에서 outMessage로 내보낸 데이터
				String clientMessage = dins.readUTF();
				System.out.println("clientMessage: " + clientMessage);

				// Client에 메세지 전송(입력)
				dops.writeUTF("메시지 전송완료");
				dops.flush();
				
				if(clientMessage.equals("STOP")) break;
				
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
