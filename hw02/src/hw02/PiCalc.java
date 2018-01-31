package hw02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiCalc {
    
    public static BigDecimal doubleFact(int num) {
        if(num <=1) return new BigDecimal(1);
        int i = num % 2 == 0 ? 2 : 1;
        BigDecimal result = new BigDecimal(1);

        for(int j=num; j>=i; j-=2) {
            result = result.multiply(new BigDecimal(j));
        }

        return result;
    }

    public static double pi3(int terms) {
        BigDecimal result = new BigDecimal(0);
        for(int i=0; i<=terms; i++) {
            BigDecimal divisor = new BigDecimal(2*i + 1);
            BigDecimal term = ((doubleFact(2*i - 1)).divide(divisor, 15, RoundingMode.HALF_UP)).divide(doubleFact(2*i), 15, RoundingMode.HALF_UP);
            result = result.add(term);
        }
        double final_result = result.doubleValue();
        return 2 * final_result;
    }
    
    public static void main(String[] args) {
        System.out.println(Math.PI - pi3(1000));
        System.out.println(Math.PI - pi3(10000));
    }
}
