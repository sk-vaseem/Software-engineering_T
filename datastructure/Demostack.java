package datastructure;



import com.example.mavenproject1.p1.Read;

public class Demostack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDs q1=new StackDs(10);
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
				q1.isoverFlow();
				break;
			case 4:
				q1.isunderFlow();
				break;
			case 5:
				q1.display();
				break;
			}
			
		}while(ch!=0);
		
		}

	}