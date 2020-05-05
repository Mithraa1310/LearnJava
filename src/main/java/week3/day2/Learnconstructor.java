package week3.day2;

public class Learnconstructor {
	int empId=100;
	String empName="Mithraa";
	boolean promotion;
	
	Learnconstructor()
	{
		System.out.println("sample default constructor");
	
	}
	
	
	public void empDetails()
	{
		String companyname="TestLeaf";
		System.out.println(companyname);
	}
	Learnconstructor(String y,int x)
	
	{
		System.out.println("Parameterized constructor");
		empId=x;
		empName=y;
	}
	public static void main(String[] args) {
		
    Learnconstructor lc=new Learnconstructor("Mrithika",200);
    System.out.println(lc.empId);
    System.out.println(lc.empName);
    System.out.println(lc.promotion);
    lc.empDetails();
    
    Learnconstructor lc1=new Learnconstructor();
    System.out.println(lc1.empId);
    System.out.println(lc1.empName);
    lc1.empDetails();
    
	}

}
