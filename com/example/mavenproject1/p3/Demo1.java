package com.example.mavenproject1.p3;

public class Demo1 {
	public static void main(String[] args) {
		AddDto dto=new AddDto();
		dto.setNum1(30);
		dto.setNum2(20);
		Arthimetic2 obj =new Add();
		obj.setData(dto);
		obj.cal();
		obj.display();
		obj =new Subtraction();
		obj.setData(dto);
		obj.cal();
		obj.display();
		
		
	}

}
