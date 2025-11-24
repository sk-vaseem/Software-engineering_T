package collections;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.mavenproject1.p1.Read;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		Map<String,Integer> mp=new LinkedHashMap<>();
		System.out.println("enter sentence");
		sentence=Read.sc.nextLine();
		String arr[]=sentence.split(" ");//spliiting regex
		for(String x:arr) {
			int y=mp.getOrDefault(x,0);
			y++;
			mp.put(x, y);
			
		}
		System.out.println(mp);

	}

}
