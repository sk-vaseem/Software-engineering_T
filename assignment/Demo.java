package assignment;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix ob1=new Matrix(3,3);
		ob1.readMatrix();
		Matrix ob2=new Matrix(ob1);
		Matrix ob3=ob1.add(ob2);
		ob1.display();
		System.out.println();
		ob2.display();
		System.out.println();
		ob3.display();

	}

}
