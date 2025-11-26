package com.example.mavenproject1.threads;



public class Game {
	public synchronized void f1() {
		try {
			notify();
			System.out.println("tik");
			wait();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void f2(int x) {
		try {
			notify();
			System.out.println("tok");
			if(x!=9) {
			wait();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
//	@Override
//	public void finalize()  {
//		// TODO Auto-generated method stub
//		try {
//			
//		}
//		catch(Exception e) {
//			
//		}
//	}
 
}
 
 
