package org.zsgs1;

import java.util.Scanner;

public class Program_30 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		
		//find largest number between three number
		     
		int d=a>b?a>c?a:c:b>c?b:c;
		System.out.println("The largest number:"+d);
		
		
		//extend top method
		if(a>b)
		{
			if(a>c)
				System.out.println("The largest number:"+a);
			else
				System.out.println("The largest number:"+c);
		}
		else if(b>c)
		{
			System.out.println("The largest number:"+b);
		}
	    else
	    	System.out.println("The largest number:"+c);

		scan.close();
	}

}
