package class04;

import java.math.BigInteger;


public class Factorials {

	public static BigInteger factorial(int num) {
		BigInteger result = new BigInteger("1"), mult;
		
		for(int i=num; i>0; i--) {
			mult = new BigInteger("" + i);
			result = result.multiply(mult);
		}
		
		return result;
	}
 	
	public static void main(StringTest[] args) {
		for(int num=1; num<30; num++) {
			System.out.println(num + "\t" + factorial(num));
		}
	}

}
