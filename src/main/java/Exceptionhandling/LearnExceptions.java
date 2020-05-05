package Exceptionhandling;

public class LearnExceptions {

	public static void main(String[] args) throws InterruptedException {
		
		int a=10,b=0;
		try
		{
		System.out.println(a/b);
		}
		
		catch(Exception e)//this s enough bcoz Exception is a super class so derived class Arithmetic exception need not be used
		{
			System.err.println("cannot divide by 0-plz provide a valid number");
		}
		/*catch(ArithmeticException e)
		{
			System.err.println("cannot divide by 0-plz provide a valid number");
		}*/
		finally
		{
			System.out.println("my job is over");
		}
		
		Thread.sleep(2000);//compile time exception we can have 'throws' for this by default
		
		//for thread.sleep we have 2 options 
		//either throws or try-catch
		
		//if we divide by zero it gives arithmetic exception so the next sys out wont work
		System.out.println("I hate math");// this line wont be executd due to line no.7
		
		
	}

}

