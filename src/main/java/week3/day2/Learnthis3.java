package week3.day2;

public class Learnthis3 {

	int a;
	int b;
	
	Learnthis3()
	{
		a=6;
		b=8;
		System.out.println("default constructor");
	}
		
void get()
{
	display(this);
}
	
	
	void display(Learnthis3 obj)
	{
		System.out.println("value of a is"+ a+"\n"+"value of b is"+b);
	}
	public static void main(String[] args) {
		
		Learnthis3 sample=new Learnthis3();
		sample.get();
	
}
}
