package org.zsgs1;

import java.util.Scanner;

public class Program_60 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
         System.out.println("Enter the number");
         int number=scan.nextInt();
         int sum=0,p=1,i=0,temp=0;
         //find sum
         while(i<number)
         {
        	 temp=temp+p;
        	sum+=temp;
        	 p*=10;
        	 i++;
         }
         System.out.println("The Sum is:"+sum);
         
	}

}
