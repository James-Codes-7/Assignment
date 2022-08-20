package org.zsgs1;

import java.util.Scanner;

public class Program_56 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		//pattern
		int i=0,space=0,j=0,temp=0;
		for(i=1;i<=number/2;i++)
		{
			
			for(space=1;space<=(number/2)-i;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(++temp+" ");
				if(temp==number)
				{
					return;
				}
			}
			System.out.println();
		}

	}

}
