package org.zsgs1;

import java.util.Scanner;

public class Program_15 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius value");
		float radius=scan.nextFloat();
		
		System.out.println("Enter the height value");
		float height=scan.nextFloat();
		
		//base area formula 2*(pi)*(radius*radius)
		float base_Area=(float) (2*3.14*(radius*radius));
		System.out.println("The base area of cylinder:"+base_Area);
		
		//curved surface area 2*(pi)*radius*height
		float curved_Area= (float) (2*3.14*radius*height);
		System.out.println("The curved surface area of cylinder:"+curved_Area);
		
		//surface area =2*(pi)*(radius*radius)+2*(pi)*radius*height
		float surface_Area= base_Area+curved_Area;
		System.out.println("The surface area of rectangle:"+surface_Area);
		scan.close();
	}

}
