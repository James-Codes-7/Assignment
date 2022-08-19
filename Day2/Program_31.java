package org.zsgs1;

import java.util.Scanner;

public class Program_31 {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   
	  System.out.println("Enter the a,b and c");
	  double a=scan.nextDouble(),b=scan.nextDouble(),c=scan.nextDouble();
	  
	  /*Quadratic equation
	   * 
	   * x=-b+root((b*b)-(4*a*c))/2*a
	   * x=-b-root((b*b)-(4*a*c))/2*a
	   */
	  double root=((b*b)-(4*a*c));
	  
	  double x=0;
	  if(root>0)
	  {
		  x=(-b+Math.sqrt(root))/(2*a);
		  System.out.println("Output 1:"+x);
		  
		  x=(-b-Math.sqrt(root))/(2*a);
		  System.out.println("Output 2:"+x);
	  }
	  else if(root==0)
	  {
		  x=(-b)/(2*a);
		  System.out.println("Output 1:"+x);
		  System.out.println("Output 2:"+x);
	  }
	  else
	  {
		 double real=(-b)/(2*a);
		 double imaginary=Math.sqrt(-root)/(2*a);
		 System.out.println("x="+real+" + "+imaginary+"i");
		 System.out.println("x="+real+" - "+imaginary+"i");
	  }
	}

}
