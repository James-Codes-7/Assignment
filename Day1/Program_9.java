package org.zsgs1;

import java.util.Scanner;

public class Program_9 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("Enter the first array size");
		int size1=scan.nextInt();
		int i=0,j=0,k=0,f=0,t=0;
		int arr1[]=new int[size1];
		System.out.println("Enter the elements to the first array");
		for(i=0;i<size1;i++) 
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the second array size");
		int size2=scan.nextInt();
		int arr2[]=new int[size1+size2];k=size2;
		System.out.println("Enter the elements to the second array");
		for(i=0;i<size2;i++)
		{
			arr2[i]=scan.nextInt();
		}
		for(i=0;i<size1;i++)
		{
			f=0;
			for(j=0;j<size2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					f=1;break;
				}
			}
			if(f==0)
			{
				arr2[k++]=arr1[i];
			}
		}
		for(i=0;i<k-1;i++)
		{
			f=0;
			for(j=0;j<k-1-i;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					 t=arr2[j];arr2[j]=arr2[j+1];arr2[j+1]=t;//swap greater elements
			         f=1;
				}
			}
			if(f==0) break;
		}
		System.out.println("Merged Array");
		for(i=0;i<k;i++) {System.out.print(arr2[i]+" ");}


	}

}
