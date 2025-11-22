package com.example.mavenproject1.p2;

public class Demo1 {
	public static void main(String[] args) {
		ArthimeticInterface ob =new Add();// for loosly coupled
		ob.setData(30, 90);
		ob.cal();
		ob.display();
		
		
		
	}

}
