package com.example.mavenproject1.filesystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\data.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\data1.txt"));
		String s1;
		while((s1=br.readLine())!=null) {
			int sum=0;
			for(String x:s1.split(",")) {
				sum=sum+Integer.parseInt(x);
				
			}
			bw.write(s1+"="+sum);
			bw.newLine();
			
		}
		br.close();
		bw.close();
		System.out.println("your file is processed successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
