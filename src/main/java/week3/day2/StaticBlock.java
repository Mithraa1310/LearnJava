package week3.day2;

public class StaticBlock {

	
		
		static int num;
		static String str;
		static int a;
		static int c;
		static int n;
		
		
		static
		{
			 a=10;
			 c=5;
			num=10;
			str=" i am sample string ";
		}
		
		//if we have two static blocks second will overwrite the first
		
		static
		{
			n=6;
			num=8;
			str="hi hello";
		
		}
		
		public static void main(String[] args) {
			
			System.out.println("the number is" +num);
			System.out.println("the string is" +str);
			System.out.println(a);
			System.out.println(c);
			System.out.println(n);
			
	}


}
