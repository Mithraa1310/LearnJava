package week1.day2;

import java.util.Arrays;

public class Cr2 {
public static void main(String[] args) {
	int[] a= {1,4,6,8,5,7,9,45,64,78,99,21};
	Arrays.sort(a);
	for(int list:a)
	System.out.println(list);
	
	char[] b= {'@','#','w','y','$','l','o','d','t','v'};
	Arrays.sort(b);
	for(char list2:b)
	System.out.println(list2);
	
	long[] c= {12398432355l,7853247899965l,451468906543224L,422467878754324L,1114564335697654L,564356534864223L,23333678887643L,44376443779864L};
	Arrays.sort(c);
	for(long list3:c)
	System.out.println(list3);
	
	float[] g= {123.4567f,876.459f,38543.5778f,5435.8765f,5621.97f,67743.345f,4598.765f,1256.43f};
	Arrays.sort(g);
	for(float list6:g)
	System.out.println(list6);
	
	byte[] n= {12,23,65,78,65,45,32,13,98,56};
	Arrays.sort(n);
	for(byte list9:n)
	System.out.println(list9);
	
	short[] s= {234,456,7789,213,543,776,3456,123,345};
	Arrays.sort(s);
	for(short list5:s)
	System.out.println(list5);
	
	double[] m= {12344.5567d,7544.677d,23456.8655d,7454.4356d,34566.743d,654335.97755d,7443.3455d,6543.87654d};
	Arrays.sort(m);
	for(double list4:m)
	System.out.println(list4);

}

}
