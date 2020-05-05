package week2.day1;

public class Mymobile1 extends Smartphone {

	public void connectfb() 
	{
		System.out.println("scroll down the posts");
	}

	public static void main(String[] args) {

		Mymobile1 mv = new Mymobile1();
		mv.connectfb();
		mv.connectwhatsapp();
		mv.makeCall();
		mv.sendSMS();

	}

}
