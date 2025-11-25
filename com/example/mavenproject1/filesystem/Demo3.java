package com.example.mavenproject1.filesystem;

import java.io.File;

import com.example.mavenproject1.p1.Read;
//opening file from folder
public class Demo3 {
	public static void main(String[] args) {
		try {
			String fname;
			System.out.println("enter filename with path and extension");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			if(f1.exists()) {
				if(f1.isDirectory()) {
					System.out.println("given is a directory");
					String arr[]=f1.list();
					for(String x:arr) {
						System.out.println(x);
					}
				}
				else {
					System.out.println("given is a file");
				}
			}
			else {
				System.out.println("file doesnot exist");
			}
			
			
		}
		catch(Exception e){
			
		}
		
		
	}

}
