package com.company;

public class Practice {

    public static void main(String[] args) {
        // Define the array
        int[] num = {10, 5, 20, 8};

        // Call the method to find the second largest number
        int secondLargest = findSecondLargest(num);

        // Print the result
        System.out.println("The second largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] num) {
        // Initialize variables to hold the largest and second largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array to find the two largest numbers
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                // Update second largest before largest
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        return secondLargest;
    }
}