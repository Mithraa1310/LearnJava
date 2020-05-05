package week2.day1;

public class Smartphone extends Mobile1 {

	public void videocall() {
		System.out.println("couldnt hear voice");
	}

	protected void connectwhatsapp() {
		System.out.println("couldnt send audio");
	}

	public static void main(String[] args) {

		Smartphone s = new Smartphone();
		s.connectwhatsapp();
		s.makeCall();
		s.sendSMS();
	}
}