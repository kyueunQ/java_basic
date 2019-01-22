package com.javaex.tv;

public class TVApp {
	
	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		// channel, volume, power 세가지 정보
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volum(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
