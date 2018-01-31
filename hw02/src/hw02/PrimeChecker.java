package hw02;

public class PrimeChecker {
    public static boolean isPrime(int num) {
    	if(num == 2) return true;
    	if(num < 2 || num % 2 == 0) return false;

        for(int i=3; i <= Math.sqrt(num); i+=2) {
            if(num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        for(int j=1; j<=10000; j++) {
            if(isPrime(j)) System.out.println(j);
        }
    }

}
