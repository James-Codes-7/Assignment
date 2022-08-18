package org.zsgs1;

public class Program_21 {

	public static void main(String[] args) {
		int y=10;
		int z=(++y*(y++ +5));
	/*y=10;
	 * 
	 * z=(++y*(y++ + 5))
	 * first precedence increment and decrement
	 *   if x=++y;
	 *      y=y+1; first increment
	 *      x=y;  next assign
	 *      
	 *      so
	 *      z=(11*(y++ +5)
	 *   next
	 *   if x=y++;
	 *     x=y; first assign 11
	 *     y=y+1; next increase y=12
	 * 
	 * z=11*(11+5)
	 * 
	 * next bracket and multiplication
	 *  
	 *  z=11*16;
	 *  
	 *  output:176
	 */
		
     System.out.println("Output:"+z);
     
	}

}
