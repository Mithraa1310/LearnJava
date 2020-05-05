package week2.day1;

public class Calculator {

	public void add(int a,int b)
	{
	System.out.println(a+b);	
	}
	
	public void add(double a,double b)
	{
	System.out.println(a+b);	
	}
	
	public void mul(int a,int b)
	{
	System.out.println(a*b);	
	}
	public void mul(double a,double b)
	{
	System.out.println(a*b);	
	}
	public void mul(int a,int b,int c)
	{
	System.out.println(a*b*c);	
	}
	
	public static void main(String[] args) {
		
		
		Calculator calc=new Calculator();
		calc.add(12.34, 56.43);
		calc.add(2, 6);
		calc.mul(8, 4);
		calc.mul(12.67, 32.78);
		calc.mul(4,7,9);
		
	}
}
