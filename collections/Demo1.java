package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeDTO> obj=new ArrayList<>();
		obj.add(new EmployeeDTO(1005,"ram"));
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEmpid(1002);
		dto.setEmpname("shyam");
		obj.add(dto);
		obj.add(new EmployeeDTO(1006,"rohan"));
		obj.add(new EmployeeDTO(1004,"jack"));
		obj.add(new EmployeeDTO(1003,"koushik"));
		System.out.println(obj);
		obj.forEach(System.out :: println);
		System.out.println(".........");
		obj.stream().filter((ob)->(ob.getEmpid()%2==0)).forEach(System.out::println);
		System.out.println("employee names");
		obj.stream().map((ob)->(ob.getEmpname())).forEach(System.out::println);
		System.out.println("name start with r using filter & map");
		obj.stream().filter((ob)->(ob.getEmpname().charAt(0)=='r')).map((ob)->(ob.getEmpname())).forEach(System.out::println);
		System.out.println("using regex");
		obj.stream().filter((ob)->(ob.getEmpname().matches("[r].*"))).map((ob)->(ob.getEmpname())).forEach(System.out::println);
		int c=(int)obj.stream().filter((ob)->(ob.getEmpname().matches("[r].*"))).map((ob)->(ob.getEmpname())).count();
        System.out.println("number of names starts with r"   +"  : "+c);
   //create a separate arraylist of empployees whose name between A to m
//		List<EmployeeDTO> obj1=new ArrayList<>();
//		obj1.add(new EmployeeDTO(1001,"Amar"));
//		obj1.add(new EmployeeDTO(1002,"Bhuvan"));
//		obj1.add(new EmployeeDTO(1003,"ram"));
        List <EmployeeDTO> obj1=obj.stream().filter((ob)->(ob.getEmpname().matches("[A-Ma-m].*"))).collect(Collectors.toList());
		System.out.println(obj1);
		System.out.println("sorting on names");
		//Collections.sort(obj,(x,y)->(x.getEmpname().compareTo(y.getEmpname())));
		//System.out.println(obj);
		//implements compare operator
		Collections.sort(obj);
		System.out.println(obj);

        
	}

}
