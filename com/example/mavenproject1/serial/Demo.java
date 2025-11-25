package com.example.mavenproject1.serial;
//serialisation

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo=new FileOutputStream("x.rm");
			Addtest ob=new Addtest();
			ob.setdata(20, 5);
			ob.cal();
			new ObjectOutputStream(fo).writeObject(ob);
			fo.close();
			System.out.println("serialisation over");
			
			
			
			
		}
		catch(Exception e) {
			e.getMessage();
			
		}
		

	}

}
