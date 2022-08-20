package org.zsgs1;

import java.util.Scanner;

public class Program_54 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		
		int arr[]=new int[size],i=0,j=0;
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
			
		}
	    //odd position number descending order even position in ascending order
		for(i=0;i<arr.length;i++)
		{
			int p=i;
			for(j=i+2;i<arr.length-2&&j<arr.length;j+=2)
			{
				if(i%2==0)//index start from zero we consider 0 ->1
				{
					if(arr[p]<arr[j])
						p=j;
					
				}
				else
				{
					if(arr[p]>arr[j])
						p=j;
				}
			}
			if(p!=i)
			{
				int t=arr[i];
				arr[i]=arr[p];
				arr[p]=t;
			}
			System.out.print(arr[i]+" ");
			
		}
		scan.close();
		
	}

}
