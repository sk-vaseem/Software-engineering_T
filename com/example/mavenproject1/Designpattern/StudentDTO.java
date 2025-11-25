package com.example.mavenproject1.Designpattern;

import java.sql.Date;
import java.time.LocalDate;

public class StudentDTO {
	private int sroll;
	
	private String firstname;
	private String lname;
	private String dob;
	private String gender;
	public int getSroll() {
		return sroll;
	}
	public void setSroll(int sroll) {
		this.sroll = sroll;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public StudentDTO(int sroll, String firstname, String lname, String dob, String gender) {
		super();
		this.sroll = sroll;
		this.firstname = firstname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
	}
	public StudentDTO() {
		//zero argument constructor
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "StudentDTO [sroll=" + sroll + ", firstname=" + firstname + ", lname=" + lname + ", dob=" + dob
				+ ", gender=" + gender + "]";
	}
	

}
