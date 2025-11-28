package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<>();
		l1.add(100);
		l1.add(200);
		l1.add(120);
		l1.add(45);
		l1.add(5);
		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
             System.out.println(".....using index......");
         for(Integer x:l1) {
        	 System.out.print(x+" ");
         }
         System.out.println("...using for each loop .....");
         l1.forEach((x)->System.out.print(x+" "));
         System.out.println("...for each consumer...");
         l1.forEach(System.out ::print);
         System.out.println("\nusing for each consumer and method reference");
         l1.forEach(Demo :: psv);
        System.out.println("\nusing for each consumer and user static method reference");
        Demo obj=new Demo();
        l1.forEach(obj::p1);
        System.out.println("\nusing for each consumer and user instance method reference");
        Iterator<Integer> it=l1.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("\n"+l1.get(4));
        l1.remove(4);
        System.out.println(l1);
        l1.remove(new Integer(200));
        System.out.println(l1);
        List<Integer> l2=new ArrayList<Integer>(Arrays.asList(new Integer[] {49,59,69,100,400}));
        System.out.println(l2);
//        l1.addAll(l2);
//        System.out.println(l1);
//        l1.retainAll(l2);
//        System.out.println(l1);
       // Collections.sort(l1);
        Collections.shuffle(l1);
      //  l1.clear();
        System.out.println(l1);
        
        
        
        
	}
	      public static void psv(Integer x) {
	    	  System.out.print(x+"-->"+(x*x)+"...");
	      }
	      public void p1(Integer x) {
	    	  System.out.print(x+"-->"+Math.sqrt(x)+"...");
	      }

}
