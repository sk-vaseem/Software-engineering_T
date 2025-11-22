package com.example.mavenproject1.p3;



public abstract class ArthimeticC2 implements Arthimetic2{
	AddDto ob;

	@Override
	public void setData(AddDto ob) {
		// TODO Auto-generated method stub
		this.ob=ob;
		
	}

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Num1= "+ob.getNum1()+"Num2 ="+ob.getNum2()+"Num3 ="+ob.getNum3());
		
	}

}
