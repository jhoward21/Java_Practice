package com.company;

import java.util.Arrays; // Needed to use Arrays.toString for output

public class TwoSumPart2 {
    public static void main(String[] args) {
        int[] num = {1, 3, 4, 6}; //An Array of numbers
        int target = 7; //The sum that the two numbers add up to

        // Call the method/function
        int[] result = findingSum(num, target);

        // Print the result to the console
        if (result.length == 2) {
            System.out.println("This is the sum: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findingSum(int[] num, int target) {//Creating the method to find the sum
        // Outer loop to pick the first number
        for (int i = 0; i < num.length; i++) {
            // Inner loop to pick the second number
            for (int j = i + 1; j < num.length; j++) {
                // Check if the two numbers add up to the target
                if (num[i] + num[j] == target) {
                    return new int[] {i, j}; // Return their indices
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[] {};
    }
}

