package com.java.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int x = 100;
		int y = 0;
		int z = 0;
		int i;
		
		System.out.println("Here");
		
		
		try {
			
			// ���ܰ� �߻��� �� ���� �κ��� ����
			z = x / y;
			i = x + y;
			
		} catch (Exception e) {
			
			// � ���ܰ� �߻��ߴ��� console�� ���
			e.printStackTrace();
			// ���ܸ� �����ϰ� ���ڷ� �޾ƿ�
			String msg = e.getMessage();
			
			System.out.println("Exception :" + msg);
		} finally {
			i = x + y;
			System.out.println(i);
		}
	
		System.out.println("Here?!");
		
	}
	
	

}
