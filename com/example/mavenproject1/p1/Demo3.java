package com.example.mavenproject1.p1;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj =new Addition();
		obj.setData(10, 20);
		obj.compute();
		obj.display();
		obj=null;// it will free the space
		obj=new Addition();
		obj.display();
		System.out.println(Addition.num3);
		System.gc();
		

	}

}
