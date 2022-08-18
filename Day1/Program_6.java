package org.zsgs1;

import java.util.Scanner;

public class Program_6 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Students count");
		int students=scan.nextInt();
		int i=0,j=0;
		//roll no startfrom 101 so we add 100 with students
		students+=100;
		System.out.println("Enter the group count");
		int gcount=scan.nextInt();
		for(i=101;i<=(100+gcount);i++)
		{
			System.out.println("Group "+(i-100)+":");
			for(j=i;j<=students;j+=gcount)
			{
				System.out.println(j);
			}
			System.out.println();
		}

	}

}
