package com.company;
import java.util.HashMap;


public class HashmapPractice2 {
    public static void main(String[] args) {
        // Step 1: Input sentence
        String sentence = "Java is fun and Java is powerful";

        // Step 2: Split sentence into words
        String[] words = sentence.split(" ");

        // Step 3: Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 4: Loop through the words and populate the HashMap
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                // If the word is already in the HashMap, increment its count
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If the word is not in the HashMap, add it with a count of 1
                wordCount.put(word, 1);
            }
        }

        // Step 5: Print the HashMap
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}

