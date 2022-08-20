package org.zsgs1;

import java.util.Scanner;

public class Program_53 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.next();
		
		int i=0,num=0,j=0;
		for(i=1;i<str.length();i++)
		{
			num=0;
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				char temp=str.charAt(i-1);
				while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9')
				{
					num=(num*10)+(str.charAt(i)-'0');
					i++;
				}
				for(j=0;j<num;j++)
				{
					System.out.print(temp);
				}
			}
		}
		scan.close();

	}

}
