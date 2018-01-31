package hw02;

import java.util.Scanner;
import java.awt.geom.Point2D;

public class PolygonWithoutArray {
    public static void main(String[] args) {
        double result = 0;

        String testVal = "";
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of nails: ");
        int num_nails = input.nextInt();
        
        while(num_nails < 1) {
            System.out.print("Invalid input, number of nails must be greater than one\nTry again: " );
            num_nails = input.nextInt();
        }
        
        // TODO: make calculations considering the {radius} value

        System.out.print("Enter the radius of nail head (not yet implemented, just give a 0): ");
        double radius = input.nextDouble();
        
        for(int i=0; i<num_nails; i++) {
            System.out.print("Enter the X,Y (comma-separated pair) coordinates of the point #" + (i+1) + ": ");
            testVal += input.next() + ",";
        }
        
        input.close();


        int comma_index = testVal.indexOf(",");
        double xVal = Double.parseDouble(testVal.substring(0, comma_index));
        
        testVal = testVal.substring(comma_index+1);
        
        comma_index = testVal.indexOf(",");
        double yVal = Double.parseDouble(testVal.substring(0, comma_index));
        
        testVal = testVal.substring(comma_index+1);

        Point2D.Double prevPoint = new Point2D.Double(xVal, yVal), firstPoint = new Point2D.Double(xVal, yVal);

        while(testVal.length() > 0) {
            comma_index = testVal.indexOf(",");
            xVal = Double.parseDouble(testVal.substring(0, comma_index));

            testVal = testVal.substring(comma_index+1);
            
            comma_index = testVal.indexOf(",");
            yVal = Double.parseDouble(testVal.substring(0, comma_index));
            
            testVal = testVal.substring(comma_index+1);
            
            Point2D.Double currPoint = new Point2D.Double(xVal, yVal);
            result += prevPoint.distance(currPoint);
            
            // Debugging.
            //System.out.println(prevPoint.getX() + "," + prevPoint.getY() + " <=> " + currPoint.getX() + "," + currPoint.getY() + " => " + prevPoint.distance(currPoint));

            prevPoint = currPoint;

        }

        result += prevPoint.distance(firstPoint);

        System.out.println("The length of the rope is: " + result);
        
    }

}