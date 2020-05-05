package week1.day1;

public class Learnelseif {
public static void main(String[] args)
{
int age=13;
if(age<=18) {
	System.out.println("teen");
}
else if((age<=40)&&(age>18))
{
System.out.println("adult");	
}
else
{
System.out.println("elderly");	
}
}
}