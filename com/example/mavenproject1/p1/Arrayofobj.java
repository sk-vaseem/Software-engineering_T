package com.example.mavenproject1.p1;

public class Arrayofobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of objects
		Arthimetic ob2[]=new Arthimetic[4];
		ob2[0]=new Add ();
		ob2[1]=new Subtraction();
		ob2[2]=new Multiply();
	    ob2[3]=new Divide();
	    System.out.println("enter 1 for add,2 for subtraction,3 for multiply,4 for division");
	    int ch=Read.sc.nextInt();
	    System.out.println("enter two numbers :");
	    ob2[ch-1].setData(Read.sc.nextInt(), Read.sc.nextInt());
	    ob2[ch-1].cal();
	    ob2[ch-1].display();
	}
}
