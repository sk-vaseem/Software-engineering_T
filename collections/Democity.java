package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Democity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Long> mp=new HashMap<>();
		mp.put("kolkata",2156l);
		mp.put("bengaluru", 3995l);
		mp.put("delhi", 41301l);
		mp.put("mumbai",4566l);
		mp.put("kolkata", 3675l);
		System.out.println(mp+"related to hashmap");
		Map<String,Long> mp1=new TreeMap<>();
		mp1.put("kolkata",2156l);
		mp1.put("bengaluru", 3995l);
		mp1.put("delhi", 41301l);
		mp1.put("mumbai",4566l);
		mp1.put("kolkata", 3675l);
		System.out.println(mp1+"related to treemap");
		Map<String,Long> mp2=new LinkedHashMap<>();
		mp2.put("kolkata",2156l);
		mp2.put("bengaluru", 3995l);
		mp2.put("delhi", 41301l);
		mp2.put("mumbai",4566l);
		mp2.put("kolkata", 3675l);
		System.out.println(mp2+"related to linkedhashmap");
		System.out.println(mp2.get("delhi"));
		mp2.keySet().forEach(System.out::println);
		mp.keySet().forEach((x)->{System.out.println(x+" "+mp.get(x));});
		mp.keySet().stream().filter((x)->(mp.get(x)>2750&&mp.get(x)<3750)).forEach((x)->{System.out.println(x+" "+mp.get(x));});
		
	}

}
