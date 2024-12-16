package com.company;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121; // Example input
        System.out.println(isPalindrome(x)); // Should print true
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the number to a string
        String str = Integer.toString(x);

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check if the original string and reversed string are the same
        return str.equals(reversed);
    }
}

