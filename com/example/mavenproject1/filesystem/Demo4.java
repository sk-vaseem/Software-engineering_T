package com.example.mavenproject1.filesystem;

import java.io.File;
import java.io.RandomAccessFile;

import com.example.mavenproject1.p1.Read;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fname;
			System.out.println("enter filename with path and extension");
			fname=Read.sc.nextLine();
			File f1=new File(fname);
			RandomAccessFile rm=new RandomAccessFile(f1,"rw");
			long fp= 0L; //fp=file pointer
			int ch;
			while((ch=rm.read())!=-1) {
				if(ch==97) {
					rm.seek(fp);
					rm.write(65);
					
				}
				fp++;
				
			}
			
			rm.close();
			System.out.println("file processing done");
			
		}
		catch(Exception e){
			
		}
		

	}

}
