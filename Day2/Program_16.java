package org.zsgs1;

import java.util.Scanner;

public class Program_16 {

	public static void main(String[] args) {
     
      Scanner scan=new Scanner(System.in);
      
      System.out.println("Enter the a,b and c");
      double a=scan.nextDouble(),b=scan.nextDouble(),c=scan.nextDouble();
      //polynomial equation
      /* ax^2+bx+c=0;
       * 
       * x=((-b)+root((b*b)-4ac)/2a
       * x=((-b)-root(b*b)-4ac)/2a
       */
      double temp= ((b*b)-(4*a*c));
      if(temp<0)
      {
    	  temp=-temp;
      }
      double x= ((-b+Math.sqrt(temp))/(2*a));
      System.out.println("Output 1:"+x);
      
      x=((-b-Math.sqrt(temp))/(2*a));
      System.out.println("Output 2:"+x);
      scan.close();
	   
	}

}
