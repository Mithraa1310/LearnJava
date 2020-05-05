package week2.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listoperations {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Facebook");
		list1.add("Google");
		list1.add("Amazon");
		list1.add("Redbus");
		list1.add("AirIndia");
		list1.add("Spicejet");
		list1.add("Flipcart");
		list1.add("Github");
		
		List<String> list2=new ArrayList<String>(list1);
		
		System.out.println("original list before performing certain operations"+ list1);
		
		Collections.shuffle(list1);
		System.out.println("after shuffling contents"+ list1);
	
		Collections.reverse(list1);
		System.out.println("after reversing contents"+ list1);
	
		Collections.copy(list2, list1);
		System.out.println("after copying contents"+ list2);
	
		Collections.rotate(list2, 2);
		System.out.println("after rotating contents"+ list2);
	
		Collections.swap(list2, 3,5);
		System.out.println("after swaping contents"+ list2);
	
	
	
	
	
	
	}

}
