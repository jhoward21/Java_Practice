package com.company;

import java.util.HashMap;

public class HashMapTwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] numTwo = {3,4,11,14};
        int targetTwo = 7;

        // Using HashMap optimized method
        int[] result = twoSum(nums, target);
        System.out.println("Hashmap result: Numbers: " + result[0] + ", " + result[1]);

        // Using Brute Force method
        int[] secondResult = newSum(numTwo, targetTwo);
        System.out.println("Brute Force Result: Numbers: " + secondResult[0] + ", " + secondResult[1]);
    }

    // Optimized HashMap approach (O(n) time complexity)
    public static int[] twoSum(int[] nums, int target){
        //Creating a hashmap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>(); //Adding integer twice because I need two integers.

        for (int i = 0; i < nums.length; i++) {//Looping through the list of numbers.
            int sum = target - nums[i]; //Calculate the sum
                if (map.containsKey(sum)) {// Check if the sum exist in the map
                    return new int[] {map.get(sum), i}; //Return the new numbers
                }
            map.put(nums[i], i); //Storing the current number, and it's index in the map.
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // Brute Force approach (O(n^2) time complexity)
    public static int[] newSum(int[] numTwo, int targetTwo){
        for (int i = 0; i < numTwo.length; i++) {
            for (int j = i + 1; j < numTwo.length; j++) {
                if(numTwo[i] + numTwo[j] == targetTwo) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
