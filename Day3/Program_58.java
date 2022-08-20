package org.zsgs1;

import java.util.Scanner;

public class Program_58 {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
        
        int i=0,j=0,space=0;
        for(i=1;i<=2*number-1;i++)
        {
        	int c=i<number?i:2*number-i;
        	for(j=number;j>=c;j--)
        	{
        		System.out.print("*");
        	}
        	for(space=c;space>1;space--)
        	{
        		System.out.print("_");
        	}
        	for(space=c;space>1;space--)
        	{
        		System.out.print("_");
        	}
        	for(j=c;j<=number;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
       scan.close();
      
	}

}
