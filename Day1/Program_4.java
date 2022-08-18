package org.zsgs1;

import java.util.Scanner;

public class Program_4 {

	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		 int a =scan.nextInt();
		 
		 System.out.println("Enter the second number");
		 int b=scan.nextInt();
		 
		 /*Bitwise AND Operator
		  *  a   b  a&b
		  *  0   0 = 0
		  *  0   1 = 0
		  *  1   0 = 0
		  *  1   1 = 1
		  * if a=10,b=7 in bits
		  * a-> 1 0 1 0
		  * b-> 0 1 1 1
		  * Output:2
		  */
		 System.out.println("Output of a&b:"+(a&b));

		 /*Bitwise OR Operator
		  *  a   b  a|b
		  *  0   0 = 0
		  *  0   1 = 1   
		  *  1   0 = 1
		  *  1   1 = 1
		  * if a=10,b=7 in bits
		  * a-> 1 0 1 0
		  * b-> 0 1 1 1
		  * Output:15
		  */
		 System.out.println("Output of a|b:"+(a|b));
		 
		 /*Bitwise XOR Operator
		  *  a   b  a^b
		  *  0   0 = 0
		  *  0   1 = 1
		  *  1   0 = 1
		  *  1   1 = 0
		  * if a=10,b=7 in bits
		  * a-> 1 0 1 0
		  * b-> 0 1 1 1
		  * Output:13
		  */
		 System.out.println("Output of a^b:"+(a^b));
		 
		 /*Bitwise  Complement Operator
		  * a=~a is a=-(a+1)
		  * b=~b is b=-(b+1);
		  * a=10,b=7;
		  * Output:-11 -8
		  */
		 System.out.printf("Output a=%d b=%d:\n",~a,~b);
		 
		 /*Left Shift Operator
		  * 
		  * a=10 left shift 2 is a<<2
		  *       32 16 8 4 2 1
		  *a->    0  0  1 0 1 0   left shift 2 times
		  *       1  0  1 0 - -   fill zero
		  * new   1  0  1 0 0 0
		  *Output  of a<<2  ->32+8=40
		  *check formula = a*(2^2)->10*(2*2)->10*4->40
		  */
		 System.out.println("Output of a<<2:"+(a<<2));
		 
		 /*Right Shift Operator
		  * 
		  * a=10 Right shift 3 is a>>3
		  *       32 16 8 4 2 1
		  *a->    0  0  1 0 1 0   right shift 3 times
		  *       -  -  - 0 0 1   fill zero
		  * new   0  0  0 0 0 1
		  *Output  of a>>3 =1
		  *check formula = a/(2^3)->10/8->1
		  */
		 System.out.println("Output of a>>3:"+(a>>3));
		 
		
	}
	
	

}
