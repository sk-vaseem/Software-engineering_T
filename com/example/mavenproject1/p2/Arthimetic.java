package com.example.mavenproject1.p2;

public abstract class Arthimetic implements ArthimeticInterface {
	int num1;
	int num2;
	int num3;
	

	@Override
	public void setData(int num1, int num2) {
		// TODO Auto-generated method stub
		this.num1=num1;
		this.num2=num2;
		
	}


	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Num1 ="+num1+"num2 ="+num2+"num3 ="+num3);
		
	}

}
