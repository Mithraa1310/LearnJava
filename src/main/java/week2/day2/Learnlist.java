package week2.day2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Learnlist {

	public static void main(String[] args) {
		
		List<String> lis=new ArrayList<String>();
		lis.add("Kavitha");
		lis.add("Mithraa");
		lis.add("Mageswari");
		lis.add("sowmya");
		lis.add("Lakshmi");
		lis.add("Sowmiya");
		lis.add("Kavitha");
		lis.add("Hari");
		lis.add("Naveen");
		lis.add("Sam");
		for (String name : lis) {
		System.out.println(name);	
		}
		Set<String> s1=new TreeSet<String>(lis);
		
		for (String name1 : s1) {
			System.out.println(name1);	
			}
Set<String> s2=new LinkedHashSet<String>(lis);
		
		for (String name2 : s2) {
			System.out.println(name2);	
			}
		
	}

}
