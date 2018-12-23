package com.java.socket;

import java.net.Socket;

public class MainClassSocket {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9000);
			// 개인pc IP : 127.0.0.1  (어디로, 포트번호)
			// 네트워크 연결장치 생성 완료
			
			System.out.println("successfully Connect the Server");
			System.out.println("socket: " + socket);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
