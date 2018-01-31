package hw02;

import java.awt.geom.Point2D;
import java.util.Scanner;

public class Polygon {
	public static void main(String[] args) {
		double result = 0;
		Scanner input = new Scanner(System.in);
		int num_nails = input.nextInt();

		//TODO: make calculations considering the {radius} value
		//double radius = input.nextDouble();
		Point2D.Double points[] = new Point2D.Double[num_nails];
		
		for(int i=0; i<points.length; i++) {
		  System.out.print("enter nail head coordinates");
		  points[i] = new Point2D.Double(input.nextDouble(), input.nextDouble());
		}
		input.close();
		
		for(int j=points.length-1; j>0; j--) {
		  result += points[j].distance(points[j-1]);
		  System.out.println(points[j].distance(points[j-1]));
		}
		
		result += points[points.length-1].distance(points[0]);
		
		System.out.println(result);
	  }
	 
}
