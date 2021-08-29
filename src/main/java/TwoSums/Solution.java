package TwoSums;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumCounter(new int[]{10,7,11,1,1},9)));
    }

    private static int[] sumCounter(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if(currentNumber == target){
                return new int[]{i};
            }
            for (int j = 0; j < array.length; j++) {
                if(currentNumber + array[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
