package com.example.mavenproject1.Designpattern.builder;
public class Demo1 {
	public static void main(String[] args) {
		Employee1 ob = new Employee1(1015,"Ram","Ayodha","CEO",1015);
		System.out.println(ob);
		Employee1 ob1 = new Employee1.Builder()
				.empId(1010)
				.empName("Shyam")
				.city("Indore")
				.managerId(1015)
				.designation("HR-O").build();
		System.out.println(ob1);
	}
}
