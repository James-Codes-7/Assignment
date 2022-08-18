package org.zsgs1;

import java.util.Scanner;

public class Program_13 {

	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	
		System.out.println("Enter the side");
		int side=scan.nextInt();
		//area of the square
		int area_Square=0;
		area_Square=side*side;
		System.out.println("The area of Squre is:"+area_Square);
	}

}
