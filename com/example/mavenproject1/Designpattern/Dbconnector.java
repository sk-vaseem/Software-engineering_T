package com.example.mavenproject1.Designpattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnector {
	public static Connection co=null;
	public static Connection getConnection() throws Exception{
		//here we handling through throws because resource are central
		//singleton only one condition should be there
		if(co==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root@39");
		}
		return co;
	}
	
	

}
