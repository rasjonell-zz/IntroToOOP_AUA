package class04;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class PointSegment {

	public static void main(StringTest[] args) {
		Scanner input    = new Scanner(System.in);
		Point2D.Double a = new Point2D.Double(input.nextDouble(), input.nextDouble());
		Point2D.Double b = new Point2D.Double(input.nextDouble(), input.nextDouble());
		Point2D.Double c = new Point2D.Double(input.nextDouble(), input.nextDouble());
		input.close();
		
		Line2D.Double segment = new Line2D.Double(b, c);
		
		System.out.println(segment);
		System.out.println(segment.ptSegDist(a) + "\n" + Math.max(a.distance(b), a.distance(c)));
	}

}
