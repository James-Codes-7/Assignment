package org.zsgs1;

import java.util.Scanner;

public class Program_47 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		int i=0,space=0,j=0,k=0,m=0,y=0;
		//pattern program
		for(i=1;i<=number;i++)
		{
			for(space=1;space<=number-i;space++)
			{
				System.out.print("  ");
			}
			y=i;
			for(k=1;k<=m+i;k++)
			{
				if(k<=i)
				{
				System.out.print(k+" ");
				}
				else
				{
					System.out.print((--y)+" ");
				}
			}
			
			m++;
			System.out.println();
		}

	}

}
