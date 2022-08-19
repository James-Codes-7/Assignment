package org.zsgs1;

import java.util.Scanner;

public class Program_36 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		scan.close();
		int arr[]=new int[size],i=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		 
       System.out.println("The even position elemets");
       for(i=0;i<size;i++)
       {
    	   if(i%2!=0)//we start the index 0 so here 0 is 1 and 1 is 2
    	   System.out.print(arr[i]+" ");
       }
      
	}

}
