package org.zsgs1;

import java.util.Scanner;

public class Program_49 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0,space=0;
		for(i=1;i<=number;i++)
		{
			for(space=number-1;space>number-i;space--)
			{
				System.out.print(" ");
			}
			for(j=number;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
