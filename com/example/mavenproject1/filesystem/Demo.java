package com.example.mavenproject1.filesystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter two numbers");
			String s1=br.readLine();
			String s2=br.readLine();
			System.out.println("sum="+(Integer.parseInt(s1)+Integer.parseInt(s2)));
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}

	}

}
