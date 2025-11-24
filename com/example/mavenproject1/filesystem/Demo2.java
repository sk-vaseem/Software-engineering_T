package com.example.mavenproject1.filesystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		FileInputStream f1=new FileInputStream("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\picture.bmp");
		FileOutputStream f2=new FileOutputStream("C:\\Users\\boddu.v\\eclipse-workspace\\mavenproject1\\src\\main\\java\\com\\example\\mavenproject1\\flesystem\\picture1.txt");
		int ch=0,i=0;
		while((ch=f1.read())!=-1){
			if(i<=500) {
				f2.write(ch);
				i++;
				
			}
			else {
				f2.write(ch);
				f2.write(ch);
				f2.write(ch);
				f1.read();
				f1.read();
				
			}
		}
		f1.close();
		f2.close();
		System.out.println("file processed successfuly");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
