package org.zsgs1;

import java.util.Scanner;

public class Program_5 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Alphabet");
		char alpha=scan.next().charAt(0);
		//change Lowecase to uppercase
		if(alpha>='a'&&alpha<='z')
		{
			alpha-=32;//ASCII difference between lowecase to uppercase
		}
		for(char a=alpha;a>='A';a--)
		{
			for(char b=a;b>='A';b--)
			{
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
