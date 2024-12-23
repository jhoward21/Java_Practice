package com.company;

public class PalindromeCheck {
    public static void main(String[] args){
        //Test Cases
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";

        System.out.println("Is \"" + str1 + "\" a palindrome? " + isPalindrome(str1));
        System.out.println("Is \"" + str2 + "\" a palindrome? " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String s) {
        // Step 1: Clean the string - remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Use two pointers to check for palindrome
        int left = 0;//Pointers to check for palindrome
        int right = cleanedString.length() - 1; //Pointer at the end.

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
        return true; // It's a palindrome
    }
}
