package com.example.mavenproject1.p4.lambda;

public class Demo {
	public static void main(String[] args) {
//		IsMath obj=new IsMath() {
//			it ask for build anonymous class so we use lambda expression
//		}
		IsMath obj=(x,y)->(x+y);
		IsMath obj1=(x,y)->{int z=x-y;
		return z;};// for {} RETURN IS NEEDED
		//IsMath obj2=(x,y)->(x*y);
		//IsMath obj3=(x,y)->(x/y);
		System.out.println(obj.cal(10, 20));
		System.out.println(obj1.cal(15, 20));
		add((x,y)->(x/y),10,2);
		add((x,y)->(x*y),10,2);
		
		//System.out.println(obj2.cal(15, 20));
		//System.out.println(obj3.cal(15, 20));
		}
	public static void add(IsMath obj,int a,int b) {
		System.out.println(obj.cal(a, b));
		
		
	}

}

@FunctionalInterface
interface IsMath{
	public int cal(int a ,int b);
	//public void cal1();//it shows error there cannot be two abstract method
	
}
