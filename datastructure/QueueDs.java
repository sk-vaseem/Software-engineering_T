package datastructure;

import com.example.mavenproject1.p1.Read;

public class QueueDs {
	Integer arr[];
	//we need two pointers front end and rear end
	int fe=-1;
	int re=-1;
	public QueueDs() {
		arr=new Integer[10];
	}
	public QueueDs(int n) {
		arr=new Integer[n];
	}
	public boolean isempty() {
		if(re==fe) {
			re=fe=-1;
			return true;
		}else {
			return false;
			
		}
	}
	public boolean isfull() {
		if(re>=arr.length) {
			return true;
		}else {
			return false;
		}
	}
	public void add() {
		
		if(isfull()) {
			System.out.println("queue is full");
		}else {
			re++;
			System.out.println("enter the value");
			arr[re]=Read.sc.nextInt();
			
		}
	}
	public void remove() {
		if(isempty()) {
			System.out.println("queue is empty");
		}else {
			fe++;
			System.out.println(arr[fe]);
			
			
		}
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	

}