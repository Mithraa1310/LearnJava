package week2.day2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Learnmap2 {

	public static void main(String[] args) {
		
		Map<Integer,String> map1=Collections.synchronizedMap(new HashMap<Integer,String>());
		
		map1.put(1000, "India");
		map1.put(1001, "UK");
		map1.put(1002, "France");
		map1.put(1003, "US");
		map1.put(1004, "Poland");
		map1.put(1005, "Netherland");
		map1.put(1006, "Australia");
		map1.put(1007, "Dubai");
		
		Map<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1011, "Indonesia");
		map2.put(1012, "Italy");
		map2.put(1013, "Nigeria");
		map2.put(1014, "Florida");
		
		System.out.println("before mapping"+ map2);
		
		map2.putAll(map1);
		
		System.out.println("after mapping"+ map2);
		
		//Learn iterator
		
		Set<Integer> countrycodes=map1.keySet();
		Iterator<Integer> iterator=countrycodes.iterator();
		
		while(iterator.hasNext())
		{
			Integer codes=iterator.next();
			String countrynames=map1.get(codes);
			
			System.out.println(codes +"---->" + countrynames);
			
		}
		
		
		Collection<String> countries=map1.values();
		
		for(String each:countries)
		{
			System.out.println(each);
		}
		
		//concurrent maps
		
		Set<Integer> ks=map1.keySet();
		synchronized (map1)
		{
		Iterator<Integer> conc=ks.iterator();
		
		while(conc.hasNext())
		{
			Integer codes=conc.next();
			String countrynames=map1.get(codes);
			
			System.out.println(codes +"---->" + countrynames);
		}
		

		
	}

}}
