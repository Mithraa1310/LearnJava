package week3.day2;

public class Learnthis2 {

	
		
		int a;
		int b;
		
		Learnthis2()
		{
			a=2;
			b=5;
			System.out.println("default constructor");
		}

		Learnthis2 get()
		{
			return this;
		}
		
		void display()
		{
			System.out.println("value of a is"+ a+"\n"+"value of b is"+b);
		}
		public static void main(String[] args) {
			
			Learnthis2 sample=new Learnthis2();
			sample.get().display();

	}

}
