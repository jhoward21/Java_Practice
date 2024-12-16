package com.company;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the function to find the indices
        int[] result = findTwoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) { //Using brute force method
        // Step 2: Write the for loop logic here
        //loop through each element in the array. This starts at the first number an iterates through the entire array.
        for (int i = 0; i < nums.length; i++){
            //Loop through the remaining elements. Starts at the next number (i + 1) to avoid checking the same pair twice
            for (int j = 0; j < nums.length; j++) {
                //Check if the two numbers add up and equals the target
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        //If no solution is found return an empty array
        return new int[] {};
    }


}

