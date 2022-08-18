package org.zsgs1;

import java.util.Scanner;

public class Program_3 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int reverse=0,temp=number;
		//Reverse the number
		while(temp>0)
		{
			reverse=(reverse*10)+(temp%10);
			temp/=10;
			
		}
		System.out.println("Output:"+(number-reverse));

	}

}
