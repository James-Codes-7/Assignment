package org.zsgs1;

import java.util.Scanner;

public class Program_46 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,p=0;
		//rotate the array right
		System.out.println("Enter the elememts to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the target rotate");
		int k=scan.nextInt();
        scan.close();
		for(i=0;i<k;i++)
		{
			p=arr[size-1];
			for(j=size-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=p;
		}
		
		System.out.println("after right rotate");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
