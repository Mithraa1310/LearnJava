package week1.day2;

public class Learnstringmethods {
	public static void main(String[] args) {
		
		String a="TestLeaf Software Solutions";
		String b="testleaf software soluTions";
		
		int l=a.length();
		System.out.println(l);
		
		int l1=b.length();
		System.out.println(l1);
		
		String str=a.toUpperCase();
		System.out.println(str);
		
		String str1=b.toLowerCase();
		System.out.println(str1);
		
		if(a.equals(b))
		{
			System.out.println("strings are matching");
		}
		else
		{
			System.out.println("string doesnot match");
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("strings match");
		}
		else
		{
			System.out.println("string doesnot match");
		}
		String ss="testleaf software";
		String s2="software";
		if(ss.contains(s2))
		{
			System.out.println("string  matches");
		}
		else
		{
			System.out.println("string doesnot have b");
		}
		
		String c="Mithraa";
		String d="Jagdish";
		System.out.println(c.concat(d));	
		 
		String e="Mrithika";
		char[] v1=e.toCharArray();
		for(char b1:v1) {
			System.out.println(b1);
		}
		
		String s4="   testleaf software solutions   ";	
		String sd=s4.trim();
		System.out.println(sd);
		
		String s9="AArushi";	
		String sm=s9.replace('A','a');
		System.out.println(sm);
		
		String r="mithraa1991october";
		String f1=r.replaceAll("[^0-9]", "-");
		System.out.println(f1);
				
	}

}
