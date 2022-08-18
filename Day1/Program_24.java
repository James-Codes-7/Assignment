package org.zsgs1;

import java.util.Scanner;

public class Program_24 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char charac=scan.next().charAt(0);
		
		System.out.println("ASCII value of "+charac+" is:"+(int)charac);
		scan.close();

	}

}
