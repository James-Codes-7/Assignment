package org.zsgs1;

import java.util.Scanner;

public class Program_38 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
        //find largest elements in the array
	     int arr[]=new int[size],i=0,max=0;
	     System.out.println("Enter the elemets to the  array");
         for(i=0;i<size;i++)
         {
        	 arr[i]=scan.nextInt();
        	 if(arr[i]>max) max=arr[i];
         }
        
         System.out.println("The largest element in the array:"+max);
         scan.close();
         
	}

}
