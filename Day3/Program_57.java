package org.zsgs1;

import java.util.Scanner;

public class Program_57 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.next();

		int i=0,j=0;
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				if(j==i||i+j==str.length()-1)
				{
                   System.out.print(str.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}


	}

}
