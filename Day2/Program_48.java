package org.zsgs1;

import java.util.Scanner;

public class Program_48 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number=scan.nextInt();
		
		int i=0,space=0,j=0,k=0,m=0;
		
		for(i=number;i>=1;i--)
		{
			for(space=number-1;space>number-i;space--)
			{
				System.out.print("  ");
			}
			k=number;
			for(j=i;j<=m+number;j++)
			{
				if(j<=number)
				System.out.print(j+" ");
				else
					System.out.print(--k+" ");
				
			}
			m++;
			System.out.println();
		}
	}
}
