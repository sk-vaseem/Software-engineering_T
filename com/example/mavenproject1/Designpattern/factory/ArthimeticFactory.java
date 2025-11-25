package com.example.mavenproject1.Designpattern.factory;

import com.example.mavenproject1.p1.Add;
import com.example.mavenproject1.p1.Arthimetic;
import com.example.mavenproject1.p1.Divide;
import com.example.mavenproject1.p1.Multiply;
import com.example.mavenproject1.p1.Subtraction;
import com.example.mavenproject1.p3.Arthimetic2;
import com.example.mavenproject1.p3.ArthimeticC2;



public class ArthimeticFactory {
	private static Arthimetic arr[]=new Arthimetic[] 
			{new Add(),new Subtraction(),new Multiply(),new Divide()};
	public static Arthimetic getarthimetic(int i) {
		return arr[i];
		
	}
			


}
