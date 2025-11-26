package com.example.mavenproject1.threads;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("iam in main company thread t1");
		Compthread t1=new Compthread("vds solutions",15);
		Compthread t2=new Compthread("sonic solutions",10);
		Compthread t3=new Compthread("sv logistics",25);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();//4threads are runnin t1,t2,t3 and main

	}

}
