package org.zsgs1;

import java.util.Scanner;

public class Program_25 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the dividend number");
		int dnumber=scan.nextInt();
		
		System.out.println("Enter the divisor number");
		int snumber=scan.nextInt();
		
		System.out.println("The Quotient:"+(dnumber/snumber));
		System.out.println("The reminder:"+(dnumber%snumber));
		
		scan.close();
	}

}
