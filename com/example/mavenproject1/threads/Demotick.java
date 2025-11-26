package com.example.mavenproject1.threads;


public class Demotick {
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("iam in main company thread t1");
		Compthread t1=new Compthread("tick",10);
		Compthread t2=new Compthread("tock",10);
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		//t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		
		t1.join();
		t2.join();
		
    }
}
