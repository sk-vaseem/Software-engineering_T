package datastructure;

import com.example.mavenproject1.p1.Read;

public class Selectionsort {
	Integer arr[];
	public Selectionsort() {
		arr=new Integer[10];
	}
	public Selectionsort(int n) {
		arr=new Integer[n];
	}
	public void  addElements() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=Read.sc.nextInt();
		}
	}
	public void sorting() {
		int j=0;
		
		while(j!=arr.length) {
			int min=arr[j];
			int mini=j;
			for(int i=j;i<arr.length;i++) {
				if(arr[i]<=min) {
					min=arr[i];
					mini=i;
					
				}
				
				
			}
			int c=arr[j];
			arr[j]=arr[mini];
			arr[mini]=c;
			j++;
		}
		System.out.println("the sorted elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		
	}
}
}
