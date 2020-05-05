package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,4,6,8,5,7,9};
char[] b= {'@','#','w','y','$','l'};
long[] c= {12398432355l,7853247899965l,451468906543224L};
float[] g= {123.4567f,876.459f,38543.5778f};
Arrays.sort(g);
for(float list6:g)
System.out.println(list6);
Arrays.sort(a);
for(int list:a)
System.out.println(list);
Arrays.sort(b);
for(char list2:b)
System.out.println(list2);
Arrays.sort(c);
for(long list3:c)
System.out.println(list3);
String[] participants= {"Mithra","Preethi","aishu"};
//to know the length or size of string
int lengthofstring=participants.length;
System.out.println(lengthofstring);
Arrays.sort(participants);
for(String names:participants)
	System.err.println(names);
	}

}
