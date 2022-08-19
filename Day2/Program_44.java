package org.zsgs1;

import java.util.Scanner;

public class Program_44 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();

		int arr[]=new int[size],i=0,f=0,k=0,j=0,duplicate=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		//find duplicates in the array
		System.out.println("The duplicates");
		for(i=0;i<size-1;i++)
		{
			f=0;	
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{    f=1;
				duplicate=arr[i];
				for(k=j;k<size-1;k++)
				{
					arr[k]=arr[k+1];
				}
				j--;
				size--;
				}
			}
			if(f==1)
			{
				System.out.print(duplicate+" ");
			}
		}
		scan.close();


	}

}
