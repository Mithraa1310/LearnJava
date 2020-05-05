package week2.day1;

public class Subsuper1 extends LearnSuper{
	
	int speed=180;
	
	public void message()
	{
		System.out.println("i am child class");
		super.message();
		System.out.println(super.speed);
	}
	public void sleep()
	{
		System.out.println("I wont sleep");
		super.sleep();
		System.out.println(speed);
	}

}
