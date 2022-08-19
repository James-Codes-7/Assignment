package org.zsgs1;

import java.util.Scanner;

public class Program_39 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,min=0;
		//find the smallest element of the array
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			if(i==0) min=arr[i];
			else if(arr[i]<min) min=arr[i];
		}
		  
		System.out.println("The smallest elements in the array:"+min);
		scan.close();
	}

}
