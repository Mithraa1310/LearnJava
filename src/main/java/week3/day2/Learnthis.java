package week3.day2;

public class Learnthis {
	
	int a;
	int b;
	
	Learnthis()
	{
		System.out.println("default constructor");
	}

	Learnthis(int s,int n)
	{
		this.a=s;
		this.b=n;
	}
	
	void display()
	{
		System.out.println("value of a is"+ a+"\n"+"value of b is"+b);
	}
	public static void main(String[] args) {
		
		Learnthis sample=new Learnthis(10,20);
		sample.display();
				
		
	}

}
