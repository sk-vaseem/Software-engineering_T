package com.example.mavenproject1.serial;

import java.io.Serializable;

public class Addtest implements Serializable {
	int num1;
	int num2;
	int num3;
	
	public void setdata(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	public void cal() {
		this.num3=num1+num2;
		
	}
	public void display() {
		System.out.println("the outout is :" + num3);
	}
	

}
