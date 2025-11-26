package datastructure;

import com.example.mavenproject1.p1.Read;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDs q1=new QueueDs(10);
		int ch=0;
		do {
			System.out.println("enter 1 for add,2 for delete ,3 for checking isfull,4 for checking isempty,5 for display, and 0 to exit");
			 ch=Read.sc.nextInt();
			switch(ch) {
			case 1:
				q1.add();
				break;
			case 2:
				q1.remove();
				break;
			case 3:
				q1.isfull();
				break;
			case 4:
				q1.isempty();
				break;
			case 5:
				q1.display();
				break;
			}
			
		}while(ch!=0);
		
		}
		
		
		
	

}
