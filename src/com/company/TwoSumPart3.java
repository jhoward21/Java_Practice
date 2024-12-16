package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSumPart3 {
    public static void main (String[] args) {
        int[] num = {5, 2, 4, 8};
        int target = 10;

        int[] result = findingSum(num, target);

        //Out putting into console the result
        if (result.length == 2){
            System.out.println("This is the sum " + Arrays.toString(result));
        } else {
            System.out.println("There is no solution"); 
        }
    }

    public static int[] findingSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
