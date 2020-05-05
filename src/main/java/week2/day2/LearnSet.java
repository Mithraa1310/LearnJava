package week2.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
	
		Set<String> set1=new HashSet<String>();
		set1.add("Mithraa");
		set1.add("Mrithika");
		set1.add("Aarushi");
		set1.add("Sai kutty");
		set1.add("Aishu");
		set1.add("Preethi");
		set1.add("Mithraa");
		set1.add("Kavin");
		set1.add("Mrithika");
		set1.add("Preethi");
		set1.add("Mithraa");
		
		System.out.println(set1);
		
		System.out.println(set1.hashCode());
		
		System.out.println(set1.size());
		
		System.out.println(set1.toArray());
		
		set1.remove("Kavin");
		System.out.println(set1);
		
		if(set1.contains("Aishu"))
		{
			System.out.println("Element present");
		}
		
		Set<String> set2=new HashSet<String>();
		set2.add("Mithraa");
		set2.add("Mrithika");
		set2.add("Aarushi");
		set2.add("Sai kutty");
		set2.add("Aishu");
		set2.add("Preethi");
		set2.add("Mithraa");
		
				
		Set<String> set3=new HashSet<String>();
		set3.addAll(set2);
	
		Iterator<String> iterator1=set3.iterator();
		while(iterator1.hasNext())
		{
			String names=iterator1.next();
			System.out.println(names);
			
		}
		
		set1.retainAll(set2);
		set2.removeAll(set3);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		if(set2.isEmpty())
		{
			System.out.println("no elements");
		}
		
		if(set1.containsAll(set3))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
	}

	

}
