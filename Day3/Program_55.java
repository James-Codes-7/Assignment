package org.zsgs1;

import java.util.Scanner;

public class Program_55 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,j=0;
		//print alphabet c
		
		for(i=1;i<=number;i++)
		{
			for(j=1;j<=number;j++)
			{
				if(i==1||i==number||j==1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
