package com.company;

public class PalindromeTwo {
    public static void main(String[] args) {
        int x = 123321; // Example input
        System.out.println(isHalfPalindrome(x)); // Should print true
    }

    public static boolean isHalfPalindrome(int x) {
        // Convert the number to a string
        String str = Integer.toString(x);

        // Find the midpoint of the string
        int len = str.length();
        int mid = len / 2;

        // Extract the first half
        String firstHalf = str.substring(0, mid);

        // Extract the second half
        String secondHalf = str.substring(len % 2 == 0 ? mid : mid + 1);

        // Reverse the second half
        String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();

        // Compare the two halves
        return firstHalf.equals(reversedSecondHalf);
    }
}
