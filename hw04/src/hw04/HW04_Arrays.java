package hw04;

import java.util.Arrays;

public class HW04_Arrays {



  /*

  // Private Methods for non-general cases

  private static boolean posOrNeg(int[] array, String operation) {
    switch (operation) {
      case "neg":
        for(int elem : array) {
          if(elem > 0) return false;
        }
        return true;
    
      case "pos":
        for(int elem : array) {
          if(elem < 0) return false;
        }
        return true;

      default:
        return false;
    }
  }



  private static int arrSum(int[] array) {
    int result = 0;
    
    for(int elem : array) {
      result += elem;
    }

    return result;
  }

  private static int maxArr(int[] array) {
    int result = array[0];

    for(int elem : array) {
      if(elem > result) result = elem;
    }

    return result;
  }

  */

  private static int maxSum(int[] array) {
    int largest = array[0], result = array[0];

    for(int i = 1; i < array.length; i++) {
      largest = Math.max(largest + array[i], array[i]);
      result = Math.max(result, largest);
    }

    return result;
  }

  public static void shift(int[] array, int offset) throws Exception {
    if(offset < array.length) {
      int[] offsetArr = new int[offset], restArr = new int[array.length - offset];

      for(int i=0; i < offsetArr.length; i++) offsetArr[i] = array[i];
      for(int j=0; j < restArr.length; j++) restArr[j] = array[offset + j];
      
      for(int k=0; k < array.length; k++) {
        if(k < restArr.length) array[k] = restArr[k];
        else array[k] = offsetArr[offset - array.length + k];
      }
    }

    else if(offset == array.length) System.out.println("The array stays the same.");
    else throw new Exception("Offset excedes array's length!");
  }




public static int mode(int[] array)
{
  if(array == null || array.length == 0) return 0;

  int count = 1, looperCount, result = array[0], temp = 0;
  
  for (int i = 0; i < (array.length - 1); i++) {
    temp = array[i];
    looperCount = 0;

    for (int j = 1; j < array.length; j++)
      if (temp == array[j]) looperCount++;
    
    if (looperCount > count) {
      result = temp;
      count = looperCount;
    }
  }
  return result;
}



  public static void main(String[] args) throws Exception{
    int[] allPos = {1, 2, 3, 4, 5};
    int[] allNeg = {-1, -2, -3, -4, -5};
    int[] difVal = {-1, 2, 3, -4, 5, 6, -7, 3, 2, 3, 4, 3};
    
    System.out.println(maxSum(allPos));
    System.out.println(maxSum(allNeg));
    System.out.println(maxSum(difVal));

    shift(allPos, 3);
    System.out.println(Arrays.toString(allPos));

    System.out.println(mode(difVal));
  }


}
