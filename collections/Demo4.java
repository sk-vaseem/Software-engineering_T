package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> qu=new ArrayDeque<Integer>();
		qu.add(100);
		qu.push(150);
		qu.add(300);
		
		System.out.println(qu);
		System.out.println(qu.remove());
		System.out.println(qu.pop());
		System.out.println(qu);
		//write a java pgm to store city population give the population for request city accept the sentence and display each word how many times it is going to display
 
	}
 

}
