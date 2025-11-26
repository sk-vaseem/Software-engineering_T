package com.example.mavenproject1.threads;

public class Player1 extends Thread {
	Game ob;
	public Player1(Game ob) {
		this.ob=ob;
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			ob.f1();
			
		}
	}
 
}
 
