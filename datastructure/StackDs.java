package datastructure;

import com.example.mavenproject1.p1.Read;

public class StackDs {
	Integer arr[];
	//we need two pointers front end and rear end
	int sp=-1;
	
	public StackDs() {
		arr=new Integer[10];
	}
	public StackDs(int n) {
		arr=new Integer[n];
	}
	public boolean isunderFlow() {
		if(sp==-1) {
			
			return true;
		}else {
			return false;
			
		}
	}
	public boolean isoverFlow() {
		if(sp>=arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	public void add() {
		
		if(isoverFlow()) {
			System.out.println("stack overflow");
		}else {
			sp++;
			System.out.println("enter the value");
			arr[sp]=Read.sc.nextInt();
			
		}
	}
	public void remove() {
		if(isunderFlow()) {
			System.out.println("stack underflow");
		}else {
			
			System.out.println(arr[sp]);
			sp--;
			
			
		}
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
