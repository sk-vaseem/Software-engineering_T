package com.example.mavenproject1.p1;

public class Addition {
	int num1,num2;
	static int num3;
	public Addition() {
		System.out.println("i am no argument constructor");
	}
	public void readData() {
		System.out.println("enter to numbers");
		num1=Read.sc.nextInt();
		num2=Read.sc.nextInt();
		
	}
	public void setData(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	public void compute() {
		this.num3=this.num1+this.num2;
	}
	public void display() {
		System.out.println("sum is "+this.num3);
	}
	public void finalize() {
		System.out.println("i am destructor");
	}{
		System.out.println("welcome to anonymous block");
	}
	static {
		System.out.println("welcome to static block");
	}

}
