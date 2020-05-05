package week1.day2;

import java.util.Arrays;

public class Learnstring {
	public static void main(String[] args) {
		String[] details= {"Mithraa","october","twentyeight","Engineering","softwaretesting"};
		int l=details.length;
		System.out.println(l);
		Arrays.sort(details);
		for(String names:details)
			System.out.println(names);
		
		}

}
