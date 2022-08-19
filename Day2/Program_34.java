package org.zsgs1;

import java.util.Scanner;

public class Program_34 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the natural number");
		int number=scan.nextInt();
		scan.close();
		/*sum of natural numbers and find the largest digit in the sum
		 * number =9;
		 * natural number start from 1
		 * so
		 * 1+2+3+4+5+6+7+8+9
		 * sum=45;
		 * largest digit=5
		 * 
		 */
		int i=0,sum=0,max=0;
		for(i=1;i<=number;i++)
	     sum+=i;
		System.out.println("Sum of Natural numbers:"+sum);
		while(sum>0)
		{
			i=sum%10;
			if(i>max) max=i;
			sum/=10;
		}
		System.out.println("The largest digit is:"+max);

		
	}

}
