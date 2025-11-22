package com.example.mavenproject1.reverse;

import java.util.Scanner;

public class Reverse {
	public int rev(int k) {
		return Integer.parseInt(rev(String.valueOf(k)));
		
	}
	
	public String rev(String k) {
		return new StringBuilder(k).reverse().toString();
		
	}
	
	

}
