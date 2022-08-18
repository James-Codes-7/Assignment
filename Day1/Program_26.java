package org.zsgs1;

public class Program_26 {

	public static void main(String[] args) {
		
		 //Primitive data type
		//it take 19 digits
		long  l=-1234567891234567891l;
		System.out.println(l);
		//long take 8 byte ->64 bit convert 
		long min=(long) Math.pow(2, 63)+1;
		long max=(long)Math.pow(2, 63);
		System.out.println("Long range is "+(-min)+" to "+max);
		
	//	byte a;
	//	short b;
		//int d;
		//byte->short->int->long
	//	l=d=b=a=89;
		 
		long g=10_22_23_000_000l;
		System.out.println(g);

	}

}
