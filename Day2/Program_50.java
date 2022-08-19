package org.zsgs1;

import java.util.Scanner;

public class Program_50 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0,space=0;
		for(i=number;i>=1;i--)
		{
			for(space=1;space<=number-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
