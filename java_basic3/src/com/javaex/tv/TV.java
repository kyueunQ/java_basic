package com.javaex.tv;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;

	public int getChannel() {
		return channel;
	}
	
	public int getVoulme() {
		return volume;
	}
	
	public TV () {}
	
	public TV (int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	
	public void power(boolean on) {
		
		this.power = on;
	}
	
	public void channel(int channel) {
		
		if(channel == 0 || channel > 255) {
			System.out.println("=====존재하지 않는 채널입니다.====");
			this.channel = this.channel;
		} 
	}
	
	public void channel(boolean up) {
		if (up = true) {
			channel++;
		} else {
			channel--;
		}
	}
	
	public void volume(int volume) {
		
		System.out.println("====볼륨 최대치를 넘어갔습니다.====");
		if(volume > 100) this.volume = this.volume;
		
	}
	
	public void volum(boolean up) {
		if (up == true) {
			volume++;
		} else {
			volume--;
		}
	}
	
	public void status() {
		System.out.println("***************************");
		System.out.println(channel);
		System.out.println(volume);
		System.out.println(power);
		System.out.println("***************************");
	}
}
