package week3.day2;

public class LearnStaticMethod {


		int empId=100;
		String empName="Mithraa";
		boolean promotion;
		static int a=3;
		static int b=5;
		static String name="Mithraa";
	
		public static void empDetails()
		{
			String companyname="TestLeaf";
			System.out.println(companyname);
	}
		
		public static void sample()
		{
			System.out.println("hello world");
		}
		
		public  void intro()
		{
			System.out.println("I am Mithraa");
		}
		
		public static void main(String[] args) {
			
		    
		    LearnStaticMethod lc1=new LearnStaticMethod();
		    System.out.println(lc1.empId);
		    System.out.println(lc1.empName);
		    lc1.intro();
		    
			//obj creation is not necessary for static variables and to call static methods
		    System.out.println(a);
			System.out.println(b);
			System.out.println(name);
			empDetails();
			sample();

}
}
