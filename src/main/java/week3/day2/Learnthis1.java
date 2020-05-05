package week3.day2;

public class Learnthis1 {

	int a;
	int b;
	
	Learnthis1()
	{
		this(10,20);
		System.out.println("default constructor");
	}

	Learnthis1(int s,int n)
	{
		
		this.a=s;
		this.b=n;
		System.out.println("parameterized constructor");//doubt
	}
	
	void display()
	{
		System.out.println("value of a is"+ a+"\n"+"value of b is"+b);
	}
	
	public static void main(String[] args) {
		
		Learnthis1 sample=new Learnthis1();
		sample.display();
				
		
	}

}
