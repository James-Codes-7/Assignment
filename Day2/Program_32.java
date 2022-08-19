package org.zsgs1;

import java.util.Scanner;

public class Program_32 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		//check number is positive
		if(number>=0)
		{
			System.out.println("The number "+number+" is positive number");
		}
		else
			System.out.println("The number "+number+" is negative number");
		
		scan.close();

	}

}
