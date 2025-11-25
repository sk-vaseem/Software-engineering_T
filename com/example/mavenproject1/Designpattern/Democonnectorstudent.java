package com.example.mavenproject1.Designpattern;

import java.nio.file.spi.FileSystemProvider;
import java.time.format.DateTimeFormatter;
import java.util.List;


import com.example.mavenproject1.p1.Read;

public class Democonnectorstudent {
	public static void main(String[] args) {
		try {
			StudentDAO s1=new StudentDAO();
			
			int ch=0;
			do {
				System.out.println("enter 0 for exit & 1 for display & 2 for display id& 3 for inserting data &4 for delete id");
				ch=Read.sc.nextInt();
				switch(ch) {
				case 0:
					System.out.println("thankyou for using this service");
					s1=null;
					break;
				case 1:
					List<StudentDTO> l1=s1.getallstudents();
					l1.forEach(System.out::println);
					System.out.println();
				case 2:
					StudentDTO ob=new StudentDTO();
					System.out.println("enter roll no to display");
					ob.setSroll(Read.sc.nextInt());
					System.out.println(s1.getbyid(ob));
					break;
				case 3:
					StudentDTO ob1=new StudentDTO();
                   // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

					System.out.println("enter roll no :");
					ob1.setSroll(Read.sc.nextInt());
					ob1.setFirstname(Read.sc.next());
					ob1.setLname(Read.sc.next());
					ob1.setDob(Read.sc.next());
					ob1.setGender(Read.sc.next());
					s1.insert(ob1);
					break;
				case 4:
					StudentDTO ob2=new StudentDTO();
					System.out.println("enter rollno to delete:");
					ob2.setSroll(Read.sc.nextInt());
					s1.deletebyId(ob2);
					System.out.println("deleted successfully");
					break;
					
					
				default:
					System.out.println("please enter correct input");
					
				}
			} 
			while (ch!=0);
			
		}
		catch(Exception e) {
			System.out.println("connection failed "+e.getMessage());
			
		}
	
	}

}
