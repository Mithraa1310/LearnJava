package week3.day1;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		
		String name="Mrithika";
		char[] str=name.toCharArray();
		Map<Character,Integer> map1=new HashMap<Character,Integer>();
		for (char c1 : str) {
			if(map1.containsKey(c1))
			{
				Integer value = map1.get(c1);
				map1.put(c1, value+1)	;
				
			}
			else {
				map1.put(c1, 1);

			}
			}
		System.out.println(map1);
		}
			
	
		
	}


