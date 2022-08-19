package org.zsgs1;

import java.util.Arrays;
import java.util.Scanner;

public class Program_41 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter the array size");
       int size=scan.nextInt();
       
       int array1[]=new int[size],array2[]=new int[size],i=0;
       System.out.println("Enter the elements to the first array");
       for(i=0;i<size;i++)
       {
    	   array1[i]=scan.nextInt();
       }
       scan.close();
       //copy the elements one array to another array
       for(i=0;i<size;i++)
       {
    	   array2[i]=array1[i];
       }
       System.out.println("The second array elemnts");
       for(i=0;i<size;i++)
       {
    	   System.out.print(array2[i]+" ");
    	   array2[i]=0;
       }
       System.out.println();
       //use predefind method
       array2=Arrays.copyOf(array1, size);
       System.out.println("The copy elements of array2");
       for(i=0;i<size;i++)
       {
    	   System.out.print(array2[i]+" ");
       }
    		   
	}

}
