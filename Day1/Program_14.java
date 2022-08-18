package org.zsgs1;

import java.util.Scanner;

public class Program_14 {

	 
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the width");
		int width=scan.nextInt();
		
		System.out.println("Enter the height");
		int height=scan.nextInt();
		//area of Rectangle
		int area_Rectangle=width*height;
		System.out.println("The area of Rectangle is:"+area_Rectangle);
		scan.close();
	}
}
