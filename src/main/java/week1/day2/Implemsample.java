package week1.day2;

public class Implemsample implements  Animal,Vehicle{
	

	//written in seperATE class(Testclass)
	/*public static void main(String[] args) {
		Implemsample obj=new Implemsample();
		obj.animalsound();
		obj.brand();
		obj.speed();
		obj.sleep();
		}
		*/ //object creation in main funtion can be done in either same class or seperate class

	

	public void brand() {
		
		System.out.println("BMW");
	}

	public void speed() {
		
		System.out.println("High speed");
	}

	public void animalsound() {
		// 
		System.out.println("it says wee");
	}

	public void sleep() {
		
		System.out.println("its sleeping dont disturb");
	}

}
