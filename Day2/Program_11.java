package org.zsgs1;

import java.util.Scanner;

public class Program_11 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the row size");
		int row=scan.nextInt();

		System.out.println("Enter the colomn size");
		int col=scan.nextInt();
        //rotate the multidimensional array
		int mat[][]=new int[row][col],i=0,j=0,k=0;
		System.out.println("Enter the elements to the matrix");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=scan.nextInt();
			}
		}
        
		System.out.println("Enter the target to rotate");
		k=scan.nextInt();
		
		for(int x=0;x<k;x++)
		{
			for(i=0;i<row;i++)
			{
				int p=mat[i][0];
				for(j=0;j<col-1;j++)
				{
					mat[i][j]=mat[i][j+1];
				}
				mat[i][j]=p;
			}
		}
		
		System.out.println("After rotate");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
