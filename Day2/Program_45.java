package org.zsgs1;

import java.util.Scanner;

public class Program_45 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		//sum of elements in the array
		int arr[]=new int[size],i=0,sum=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of elements in the array:"+sum);
		scan.close();

	}

}
