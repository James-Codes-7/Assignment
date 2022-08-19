package org.zsgs1;

import java.util.Scanner;

public class Program_35 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		scan.close();
		/*factorial of the number and factorial's number sum of digits
		 * number =5;
		 * 5!=5*(5-1)!
		 * so
		 * 5!=5*4*3*2*1->120
		 * sum of digits=3; 
		 */
		int i=0,fact=1,totalsum=0;
		for(i=number;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("The factorial of number "+number+" is "+fact);
		int k=fact;
		while(k>0)
		{
			totalsum+=(k%10);
			k/=10;
		}
		System.out.println("The factorial "+fact+" sum of digit is:"+totalsum);
		




	}

}
