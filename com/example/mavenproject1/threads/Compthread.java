package com.example.mavenproject1.threads;

public class Compthread extends Thread{
	String n1;
	int m;
	public Compthread() {
		n1="ABCDORG";
		m=10;
	}
	public Compthread(String n1,int m) {
		this.n1=n1;
		this.m=m;
	}
	@Override
	public void run()
	{
		for(int i=0;i<m;i++) {
			System.out.println(n1+"..."+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
