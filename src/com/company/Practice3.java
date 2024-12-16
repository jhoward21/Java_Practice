package com.company;

public class Practice3 {
    public static void main(String[] args) {
        // We want to find the maximum product of two elements inside an array

        // Creating an array to hold our numbers/data
        int[] nums = {3, 4, 5, 2};

        // Calling the method to calculate the maximum product
        int maxProduct = maxProduct(nums);

        // Output the result
        System.out.println("The maximum product is: " + maxProduct);
    }

    // Creating the method/function here
    public static int maxProduct(int[] nums) {
        // Initialize variables to hold the two largest numbers
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the two largest numbers
        for (int num : nums) {
            if (num > largest) {
                // Update secondLargest before largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        // Calculate and return the maximum product
        return (largest - 1) * (secondLargest - 1);
    }
}

