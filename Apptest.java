package com.example.mavenproject1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import com.example.mavenproject1.Designpattern.Dbconnector;
import com.example.mavenproject1.Designpattern.StudentDAO;
import com.example.mavenproject1.Designpattern.StudentDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.*;


import org.junit.jupiter.api.Assertions;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Apptest{
	@Test
	public void testcase1() {
		Assertions.assertTrue(true);
	}
	@Test
	public void dbcontest() {
		try {
			Connection co=Dbconnector.getConnection();
			
		}
		catch(Exception e) {
			fail();
		}
	}
	@Test
	public void dbtest2() {
		try {
			List<StudentDTO> l1=new StudentDAO().getallstudents();
		}
		catch(Exception e) {
			fail();
		}
	}
	@Test
	public void dbtest3() {
		try {
			List<StudentDTO> l1=new StudentDAO().getallstudents();
			if(l1.size()<0) fail();
		}
		catch(Exception e) {
			fail();
		}
	}
	//write a test case find by id
	@Test
	public void dbtest4() {
			try {
				StudentDTO ob1=new StudentDTO();
				ob1.setSroll(1002);
				StudentDTO ob=new StudentDAO().getbyid(ob1);
				
			}catch(Exception e) {
				fail();
				
			}
	}
		//parametirized testing it tests all the parameters present or not
		@ParameterizedTest
		@ValueSource(ints= {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1013})
		public void dbtest5(int x) {
			try {
				
				StudentDTO ob1=new StudentDTO();
				ob1.setSroll(x);
				StudentDTO ob=new StudentDAO().getbyid(ob1);
				
			}catch(Exception e) {
				fail();
				
			}
	}
		@ParameterizedTest
		@ValueSource(ints= {2001,2019,2023})
		public void dbtest6(int x) {
			try {
				
				StudentDTO ob1=new StudentDTO();
				ob1.setSroll(x);
				StudentDTO ob=new StudentDAO().getbyid(ob1);
				fail();
		
			}catch(Exception e) {
				//fail();
				
			}
	}
		@Test
		public void dbtest6() {
			try {
				StudentDTO ob1=new StudentDTO();
				ob1.setSroll(1006);
				StudentDTO ob=new StudentDAO().getbyid(ob1);
				assertEquals("Dipa",ob.getFirstname());
				
				
			}
			catch(Exception e) {
				fail();
			}
		}
		

}