package org.zsgs1;

import java.util.Scanner;

public class Program_43 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,k=0,j=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		//left rotate the array
		System.out.println("Enter the target to rotate");
		k=scan.nextInt();
		
		for(i=0;i<k;i++)
		{
			int p=arr[0];
			for(j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=p;
		}
		System.out.println("The left rotate");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}

}
