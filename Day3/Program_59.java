package org.zsgs1;

import java.util.Scanner;

public class Program_59 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string");
         String str1=scan.nextLine();
         
         System.out.println("Enter the  second string");
         String str2=scan.nextLine();
         
         //check if  str2 is substring of str1
         
         int i=0,j=0,k=0;
         for(i=0;i<=str1.length()-str2.length();i++)
         {         k=1;
        	 for(j=i;j<i+str2.length();j++)
        	 {
        		 if(str1.charAt(j)!=str2.charAt(j-i))
        		 {
        			 k=0;
        			 break;
        		 }
        	 }
        	 if(k==1)
        	 {
        		 System.out.println("Output:"+i);return;
        	 }
         }
         System.out.println(-1);
         scan.close();
	}

}
