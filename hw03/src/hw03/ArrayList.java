package hw03;

import java.util.Arrays;

public class ArrayList {

    public static void main(String[] args) {
        int[] ones = new int[6]; 

        Arrays.fill(ones, 1);
        
        for(int elem : ones) {
            System.out.print(elem + "\t");
        }

        int[] forward = new int[6];

        for(int i=0; i<forward.length; i++) {
            forward[i] = i;
        }

        int[] backward = new int[6];

        for(int i=0; i<backward.length; i++) {
            backward[i] = backward.length - 1 - i;
        }

        System.out.print("\n" + );
    }
}