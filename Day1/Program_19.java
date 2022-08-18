package org.zsgs1;

public class Program_19 {

	public static void main(String[] args) {
		int a=28;
		/* a=28
		 *  
		 * a+=a++ + ++a +--a+a--;
		 * 
		 * first precedence  increment and  decrement 
		 * if x=a++;
		 *    x=a; first assign 28
		 *    a=a+1 next increment a=29
		 * so
		 *    a+=28 + ++a + --a+a--
		 *   if x=++a;
		 *      a=a+1; first increase a=30
		 *      x=a;  next assign 30
		 * so
		 *    a+=28+30+ --a+a--;
		 *   if x=--a;
		 *      a=a-1; first decrease a=29
		 *      x=a;  next assign 29
		 * so
		 *   a+=28+30 +29+a--;
		 *   x=a--;
		 *    x=a; first assign 29
		 *    a=a-1 next decrement a=28
		 *    
		 *    so
		 *    a+=28+30+29+29;
		 *    
		 *    next arithmetic operator plus all the value left to right
		 *    a+=116;
		 *    
		 *    next assignment operator
		 *    a+=116;
		 *    a=a+116;
		 *    a=28+116;
		 *   output: a=144;
		 */
		System.out.println("Output:"+(a+=a++ + ++a +--a +a++));

	}

}
