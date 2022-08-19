package org.zsgs1;

import java.util.Scanner;

public class Program_27 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		
		/*swap two numbers
		 * a=4,b=5;
		 * a=a+b->4+5->9;
		 * b=a-b->9-5->4;
		 * a=a-b->9-4->5 
		 * output a=5,b=4
		 */
           a=a+b;
           b=a-b;
           a=a-b;
		System.out.println("a="+a+" b="+b);
		
		int t=a;
		a=b;
		b=t;
		System.out.println("a="+a+" b="+b);
		
		scan.close();

	}

}
