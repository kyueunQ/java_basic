package com.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainClassSeverSocket {
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		// 요청을 받는 기능도 필요함
		
		Socket socket = null;
		// 요청 보냄
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("Complete. Welcome, Client!");
			
			socket = serverSocket.accept();
			// Client가 들어오면 accept()가 받아줌
			// accept가 socket 객체를 반환해줌
			System.out.println("Connect the client");
			System.out.println("sockt: " + socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
