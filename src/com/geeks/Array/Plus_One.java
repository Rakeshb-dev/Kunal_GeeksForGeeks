package com.geeks.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
     int[] arr ={4,3,2,1};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
            int n = digits.length;


            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
    }
}


