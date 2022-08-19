package org.zsgs1;

import java.util.Scanner;

public class Program_42 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the elements to the array");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0,freq[]=new int[size],k=0,count=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//find frequency of each elements in the array
		for(i=0;i<size;i++)
		{
			count=1;
			for(j=i+1;i<size-1&&j<size;j++)
			{ 
				if(arr[i]==arr[j]) {
					count++;
					for(k=j;k<size-1;k++)
					{
						arr[k]=arr[k+1];
					}
					j--;
					size--;
					
				}
			}
			freq[i]=count;
		}
		System.out.println("The elements  and  its fraquency");
		for(i=0;i<size;i++)
		{
		  System.out.println(arr[i]+"->"+freq[i]);
		}
      scan.close();
	}

}
