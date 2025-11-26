package datastructure;

import com.example.mavenproject1.p1.Read;

public class Bubblesort {
	Integer arr[];
	public Bubblesort() {
		arr=new Integer[10];
	}
	public Bubblesort(int n) {
		arr=new Integer[n];
	}
	public void  addElements() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=Read.sc.nextInt();
		}
	}
	public void sorting() {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		System.out.println("the sorted elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
