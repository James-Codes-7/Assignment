package org.zsgs1;

import java.util.Scanner;

public class Program_51 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();

		int reverse=0;
		//reverse the number
		while(number>0)
		{
			reverse=(reverse*10)+(number%10);
			number/=10;
		}
		System.out.println("The number in reverse order:"+reverse);
		scan.close();
	}

}
