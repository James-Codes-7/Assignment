package org.zsgs1;

import java.util.Scanner;

public class Program_7 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
     System.out.println("Enter the String");
     String str=scan.next();
     int i=0,j=0;
     for(i=0;i<str.length();i++)
     {
    	 for(j=0;j<str.length();j++)
    	 {
    		 if(i==j||i+j==str.length()-1)
    		 {
    			 System.out.print(str.charAt(i));
    		 }
    		 else
    			 System.out.print(" ");
    	 }
    	 System.out.println();
     }

	}

}
