package org.zsgs1;

import java.util.Scanner;

public class Program_37 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int arr[]=new int[size],i=0;
		scan.close();
		System.out.println("Enter the elements to the array");
		for(i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("The odd position elements");
		for(i=0;i<size;i++)
		{
			if(i%2==0)//the index start at 0 so here 1 is 0 and 3 is 2
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
