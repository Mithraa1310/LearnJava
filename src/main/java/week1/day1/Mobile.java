package week1.day1;

public class Mobile {
	public void brandname() {
		System.out.println("apple");
	}
	public void color()
	{
		System.out.println("black");
	}
	public void phonenumber(){
		System.out.println("987654356");
		
	}
	public void memoryspace()
	{
		System.out.println("32GB");
	}
	public void camera()
	{
		System.out.println("15MP");
	}
	public void dimensions()
	{
		System.out.println("1080*2340 FullHD");
	}
	public void fingerprint()
	{
		boolean fing=false;
		System.out.println(fing);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile ph=new Mobile();
ph.brandname();
ph.camera();
ph.color();
ph.dimensions();
ph.memoryspace();
ph.fingerprint();
ph.phonenumber();
	}

}
