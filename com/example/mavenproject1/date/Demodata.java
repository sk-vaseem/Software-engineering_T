package com.example.mavenproject1.date;

public class Demodata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Festival f1=new Festival();
		try {
			f1.SetData("2025-03-30");
			f1.ramCal();
			System.out.println("diwali calender");
			f1.SetData("2025-10-20");
			f1.deepCal();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
