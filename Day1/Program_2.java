package org.zsgs1;

import java.util.Scanner;

public class Program_2 {

	static Scanner scan=new Scanner(System.in); 
	public static void main(String[] args) {
		

		System.out.println("Enter the Character");
		char charac=scan.next().charAt(0);
		//if We give lowercase Letter  change it uppercase letter
		if(charac>='a'&&charac<='z')
		{
			charac-=32;//32 is ASCII difference between Lowercase and uppercase 
		}
		for(char i=charac;i<='Z';i++)
		{
			System.out.print(i);
		}
	}

}
