package com.example.mavenproject1.Designpattern.factory;

import com.example.mavenproject1.p1.Arthimetic;

public class DemoAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arthimetic obj=ArthimeticFactory.getarthimetic(0);
		obj.setData(20,40);
		obj.cal();
		obj.display();

	}

}
