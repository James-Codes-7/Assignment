package org.zsgs1;

import java.util.Scanner;

public class Program_10 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int i=0,j=0,arr[]=new int[size],p=0,t=0;
		System.out.println("Enter the elememts to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(i=0;i<size;i++)
		{
			
				p=i;
				for(j=p+1;i<size-1&&j<size;j++)
				{
					if(i%2==0&&arr[p]<arr[j])
					{
						p=j;
					}
					else if(i%2!=0&&arr[p]>arr[j])
					{
						p=j;
					}
				}
				if(p!=i)
				{
					t=arr[i];
					arr[i]=arr[p];
					arr[p]=t;
				}
				System.out.print(arr[i]+" ");
			}
		}
		

	}


