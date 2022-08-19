package org.zsgs1;

import java.util.*;
public class Program_33 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the character");
		char charac=scan.next().charAt(0);
		
		//check if alphabet or not
		if((charac>='a'&&charac<='z')||(charac>='A'&&charac<='Z'))
		{
			System.out.println("The character "+charac+" is Alphabet");
		}
		else
			System.out.println("The character "+charac+" is not Alphabet");
		
		scan.close();

	}

}
