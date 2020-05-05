package week1.day2;

public class String_sample {

	public static void main(String[] args) {
		
		String a="Mithraa";
		String b="Friendship";
		
		//char[] ca = a.toCharArray();
		//System.out.println(ca);
		
		int c=b.compareTo(a);
		System.out.println(c);
		
		boolean d=a.contentEquals(b);
		System.out.println(d);
		
		boolean m=b.contentEquals(a);
		System.out.println(m);
		
		//boolean m1=b.contentEquals(ca);
		//System.out.println(m1);//doubt
		
		
		

	}

}
