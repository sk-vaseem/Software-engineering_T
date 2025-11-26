package com.example.mavenproject1.threads;

public class Demotiktok {

	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Game g1= new Game();
			
			Player1 p1=new Player1(g1);
			Player2 p2=new Player2(g1);
			p1.start();
			p2.start();
		}
	 
	}
