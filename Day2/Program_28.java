package org.zsgs1;

import java.util.Scanner;

public class Program_28 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		//even or odd
		if(number%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		scan.close();
	}

}
