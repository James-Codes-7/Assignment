package org.zsgs1;

public class Program_23 {

	public static void main(String[] args) {
		
		/*if x=5 find x1
		 * x1=++x - x++ + --x;
		 * if a=++x;
		 *  x=x+1; first increment x=6
		 *  a=x next assign 6
		 * 
		 * so x1=6 -x++ + --x; next post increment
		 * 
		 * if a=x++;
		 *   a=x; first assign 6
		 *   x=x+1; next increment x=7
		 *   
		 *  so x1=6 -6+ --x;
		 *  
		 *  if a=--x;
		 *    x=x-1; first decrease x=6
		 *    a=x; next assign 6;
		 *   
		 *   so x1=6-6+6;
		 *   
		 *   evaluate 
		 *   
		 *   output:6
		 */
		int x=5,x1=0;
		
		x1=++x -x++ + --x;
		System.out.println("The value of x1 is:"+x1);

	}

}
