package org.zsgs1;

import java.util.Scanner;

public class Program_20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the x");
		int x=scan.nextInt();
		/* x=x++*2+3*--x
		 * 
		 * x=5;
		 * 
		 * first increment and decrement operators
		 * 
		 * if a=x++;
		 *    a=x;  first assign 5
		 *    x=x+1;next increment x=6;
		 *  so
		 *   x=5*2+3*--x;
		 *  now decrement
		 *  if a=--x;
		 *     x=x-1; first decrement x=5
		 *     a=x; next assign 5; 
		 *     
		 *     so
		 *     x=5*2+3*5;
		 *     
		 *     next multiplication operator left to  right
		 *    
		 *    x=10+15;
		 *    
		 *    next plus operator
		 *    
		 *    output:x=25
		 */
		x=x++*2+3*--x;
		System.out.println("Output:"+x);
		scan.close();
	}

}
