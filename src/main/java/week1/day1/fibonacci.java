package week1.day1;

public class fibonacci {
public static void main(String[] args) {
	int range=8;
	int i;
	int first=0;
	int second=1;
	int sum;
	for(i=0;i<range;i++)
	{
		System.out.println(first);
		sum=first+second;
		first=second;
		second=sum;
	}
}
}
