package org.zsgs1;

import java.util.Scanner;


public class Program_52 {
	public static void reverse(String arr[],int i)
	{
		if(i<0)
		{
			return;
		}
		System.out.print(arr[i]+" ");
		reverse(arr,i-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		
		String arr[]=str.split(" ");
		//reverse the string using recursion
		reverse(arr,arr.length-1);
		scan.close();
		
		
		
		

	}

}
