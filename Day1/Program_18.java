package org.zsgs1;

import java.util.Scanner;

public class Program_18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter the first number");
       int a=scan.nextInt();
       
       System.out.println("Enter the second number");
       int b=scan.nextInt();
       
       
       /*i) ++a-b--
            a=5,b=4
            first precedence post decrement
            if x=b--;
               x=b;    first assign
               b=b-1;  next decrease b=3
           so
             ++a-4;
             second precedence prefix increment
              if x=++a;
                 a=a+1;   first increase a=6
                 x=a;     next assign 
           output: 6-4=2;   
        */
       System.out.println("Output:"+(++a-b--));
       
       /* ii)a%b++
        * 
        * first precedence post increment
        *   if x=b++;
        *      x=b;  first assign 
        *      b=b+1; next increment b=4
        *   so
        *      a%3;
        *   second precedence modulo 
        *    
        *    a=6;
        *  output:  a%3->6%3->0
        */
       System.out.println("Output:"+(a%b++));
       
       
       /* iii)a*=b+5;
        * 
        * first precedence plus operator
        * 
        * b=4;
        * b+5->9
        * second precedence assignment operator
        * 
        * if a*=9 ;
        *   a=a*9;
        *   a=6*9;
        *   a=54
        *   output:54
        */
       System.out.println("Output:"+(a*=b+5));
       
       
       /* iv) x=69>>>2;
        * 
        *        64 32 16 8 4 2 1
        * 69->   1  0  0  0 1 0 1     2 times right shift
        *  
        *  so    -  -  1  0 0 0 1     fill zeros
        *  
        *        0  0  1  0 0 0 1
        *       
        * Output: 17
        * 
        * check formula: 69/(2^2)->69/4->17(integer value)
        *    
        */
       System.out.println("Output:"+(69>>>2));
       scan.close();
	}

}
