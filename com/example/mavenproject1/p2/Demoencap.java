package com.example.mavenproject1.p2;

public class Demoencap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ob=new EncapsulationDemo();
		//System.out.println(ob.a);//private method
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		//ob.f1();//private
		ob.f2();
		ob.f3();
		ob.f4();

	}

}
  