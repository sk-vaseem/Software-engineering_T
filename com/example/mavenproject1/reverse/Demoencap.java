package com.example.mavenproject1.reverse;

import com.example.mavenproject1.p2.EncapsulationDemo;

public class Demoencap extends EncapsulationDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ob=new EncapsulationDemo();
		//System.out.println(ob.a);//private method
		//System.out.println(ob.b);//default
		//System.out.println(ob.c);// it "has a "relationship not "is a"
		System.out.println(ob.d);
		//ob.f1();//private
		//ob.f2();
		//ob.f3();
		ob.f4();

	}
	public void test() {
		//System.out.println(a);//private
		//System.out.println(b);//default
		System.out.println(c);
		System.out.println(d);
	}

}
