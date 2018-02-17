package quiz03;


public class Quiz03MakeUp {
  public static double variance(double[] x) {
    double m = 0, result = 0, sum = 0;
    
    for(double elem : x) sum += elem;
    m = sum / x.length;
  
    for(int i=0; i<x.length; i++) {
      result += (x[i] * m) * (x[i] * m); 
    }

    return result / x.length;

  }
  

  public static double perimeter(double[] x, double[] y) {
    double result = 0;

    for(int i = 0; i < x.length - 1; i++) {
      double x_coord = (x[i+1] - x[i]);
      double y_coord = (y[i+1] - y[i]);
      
      result += Math.sqrt((x_coord * x_coord) + (y_coord * y_coord));
    }

    int l = x.length;
    double l_x_coord = x[l-1] - x[0];
    double l_y_coord = y[l-1] - y[0];

    result += Math.sqrt((l_x_coord * l_x_coord) + (l_y_coord * l_y_coord));

    return result;
  }


  public static String polyString(int[] p) {
    String result = (p[p.length - 1] < 0 ? "-" : "") + Math.abs(p[p.length - 1]) + "x^" + (p.length - 1) + " ";;
    
    
    for(int i=p.length - 2; i > 0; i--) {
      if(p[i] != 0) {
	      if(p[i] != 1 && p[i] != -1) {
	        result += (p[i] < 0 ? "- " : "+ ") + Math.abs(p[i]) + "x^" + i + " ";
	      } else {
	        result += (p[i] < 0 ? "- " : "+ ") + "x^" + i + " ";
	      }
      }
    }

    if(p[0] != 0) {
      result += (p[0] < 0 ? "- " : "+ ") + Math.abs(p[0]);
    }
    
    return result;
  }

  public static void main(String[] args) {
    double[] list = {1, 2, 3, 4};
    double ex1 = variance(list);
    
    double[][] coords = {{0, 5, 5, 0}, {0, 0, -5, -5}};
    int[] coeffs = {-5, 3, -1, 0, 8};

    System.out.println(String.valueOf(ex1));
    System.out.println(String.valueOf(perimeter(coords[0], coords[1])));
    System.out.println(polyString(coeffs));
  }
}
