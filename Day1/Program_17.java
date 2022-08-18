package org.zsgs1;

import java.util.Scanner;

public class Program_17 {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//the area between two concentric circles = pi((R*R)-(r*r))
		System.out.println("Enter the Outercircle Radius");
		float outerRadius=scan.nextInt();

		System.out.println("Enter the Innercircle Radius");
		float innerRadius=scan.nextInt();

		float concentricCircles= (float) (3.14*((outerRadius*outerRadius)-(innerRadius*innerRadius)));

		System.out.println("The area between two concentric circles:"+concentricCircles);

		scan.close();
	}

}
