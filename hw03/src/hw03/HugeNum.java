package hw03;

import java.math.BigInteger;

public class HugeNum {
    public static boolean isFactor_by_Big(String hugeNum, int digit) {
        if(digit == 0) return false;
        if(digit == 10) return isFactor_by_Big(hugeNum, 5) && isFactor_by_Big(hugeNum, 2);
        String num = new Integer(digit).toString();
        BigInteger main_num, divisor, zero;
        boolean  result;
        
        main_num = new BigInteger(hugeNum);
        divisor = new BigInteger(num);
        zero = new BigInteger("0");

        result = main_num.remainder(divisor).equals(zero);

        return result;
        
    }

    private static boolean isDivisible_by3or9(String strNum, int factor) {
        int sum = 0;

        for(int i=0; i<strNum.length(); i++) {
            sum += Character.getNumericValue(strNum.charAt(i));
        }

        return sum % factor == 0;
    
    }

    private static boolean isDivisible_by2(String strNum) {
        int lDigit = Character.getNumericValue(strNum.charAt(strNum.length() - 1));

        return lDigit % 2 == 0;
    }

    private static boolean isDivisible_by4(String strNum) {
        int lastTwo = Integer.parseInt(strNum.substring(strNum.length()-2, strNum.length()));

        return lastTwo % 4 == 0;

    }

    private static boolean isDivisible_by5(String strNum) {
        int lDigit = Character.getNumericValue(strNum.charAt(strNum.length() - 1));

        return isDivisible_by10(strNum) || lDigit == 5;
    }

    private static boolean isDivisible_by8(String strNum) {
        int lastThree = Integer.parseInt(strNum.substring(strNum.length() - 3, strNum.length()));

        return lastThree % 8 == 0;
    }

    private static boolean isDivisible_by10(String strNum) {
        int lDigit = Character.getNumericValue(strNum.charAt(strNum.length() - 1));

        return lDigit == 0;
    }

    private static boolean isDivisible_by7(String strNum) {
        if(Integer.parseInt(strNum) <= 0) return false;

        String tillLast = strNum.substring(0, strNum.length() - 1);
        int last = Character.getNumericValue(strNum.charAt(strNum.length() - 1));
        int result_int = Integer.parseInt(tillLast) - (2 * last);
        if(result_int % 7 == 0) return true;
        else return isDivisible_by7(Integer.toString(result_int));
    }

    public static boolean isFactor_by_Rule(String hugeNum, int digit) {
        switch (digit) {
            case 0:
                return false;
            
            case 1:
                return true;
            
            case 2:
                return isDivisible_by2(hugeNum);

            case 3:
                return isDivisible_by3or9(hugeNum, 3);

            case 4:
                return isDivisible_by4(hugeNum);

            case 5:
                return isDivisible_by5(hugeNum);
            
            case 6:
                return isDivisible_by2(hugeNum) && isDivisible_by3or9(hugeNum, 3);
            
            case 7:
                return isDivisible_by7(hugeNum);
            
            case 8:
                return isDivisible_by8(hugeNum);

            case 9:
                return isDivisible_by3or9(hugeNum, 9);

            case 10:
                return isDivisible_by10(hugeNum);

            default:
                return false;
        }
    }


    public static String cyclic(int digit) {
        return "SOME STRING";
    }

    public static void main(String[] args) {
        System.out.println("Inefficient method with BigInteger data type:\n");
        
        for(int i=0; i<=10; i++) {
            System.out.print(i + ": " + isFactor_by_Big("123456", i) + " ");
        }

        System.out.println("\n\nRelatively more efficient way with String data type:\n");

        for(int j=0; j<=10; j++) {
            System.out.print(j + ": " + isFactor_by_Rule("123456", j) + " ");
        }
    }
}