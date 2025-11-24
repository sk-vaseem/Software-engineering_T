package com.example.mavenproject1.p4.lambda;

import java.util.function.Predicate;
@FunctionalInterface
interface Test1<T,T1>{
	public T1 f1(T x);
	
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1<String,Integer> ob=(x)->(x.length());
		System.out.println(ob.f1("vaseem"));
		Predicate<Integer> ob1=(x)->(x%2==0);
		if(ob1.test(3)) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
			
		}

	}

}
