package com.example.mavenproject1.p3;

public class Subtraction extends ArthimeticC2{

	@Override
	public void cal() {
		ob.setNum3(ob.getNum1()-ob.getNum2());
		System.out.println(ob.getNum3());
		
	}

}
