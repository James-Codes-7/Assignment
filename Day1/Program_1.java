package org.zsgs1;

import java.util.Scanner;

public class Program_1 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		int number=scan.nextInt();
		int i=1;
		System.out.println("Multiplication Table");
		for(i=1;i<=15;i++)
		{
			System.out.printf("%d * %d = %d\n",i,number,(i*number));
			
		}
        System.out.println("Substruction Table");
        for(i=1;i<=number;i++)
        {
        	System.out.printf("%d - %d = %d\n",number,i,(number-i));
        }
	}

}
