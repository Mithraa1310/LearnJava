package week2.day1;

import java.util.Scanner;

public class Smartphone2 extends Mobile2 {

	public void videocall() {
		System.out.println("couldnt hear voice");
	}

	protected void connectwhatsapp() {
		System.out.println("couldnt send audio");
	}
	

	public static void main(String[] args) {

		Smartphone2 s1 = new Smartphone2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		s1.connectwhatsapp();
		s1.makeCall(str);
		s1.sendSMS();
	}
}