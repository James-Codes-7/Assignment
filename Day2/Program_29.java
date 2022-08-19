package org.zsgs1;

import java.util.Scanner;

public class Program_29 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the character");
		char charac=scan.next().charAt(0);
		char temp=charac;
		if(charac>='A'&&charac<='Z')
			charac+=32;//change to lower case letter
		
		//vowel or consonant
		if(charac=='a'||charac=='e'||charac=='i'||charac=='o'||charac=='u')
		{
			System.out.println("The character "+temp+" is vowel");
		}
		else
			System.out.println("The character "+temp+" is consonant");
		scan.close();
	}

}
