package com.example.mavenproject1.Designpattern;

import java.sql.Connection;

public class Democonnector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=Dbconnector.getConnection();
			System.out.println("Connection succesful");
			
		}
		catch(Exception e) {
			System.out.println("connection failed :" +e.getMessage());
		}

	}

}
