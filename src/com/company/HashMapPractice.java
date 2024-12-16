package com.company;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store student names and grades
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Step 2: Add students and their grades
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 78);

        // Step 3: Retrieve and print a grade
        int aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade: " + aliceGrade);

        // Step 4: Loop through the HashMap and print all key-value pairs
        for (String student : studentGrades.keySet()) { //The keySet() method gives you access to all the keys in the HashMap. Using keySet() ensures that you loop through each key without worrying about the internal structure of the HashMap.
            int grade = studentGrades.get(student);
            System.out.println("Student: " + student + ", Grade: " + grade);
        }
    }
}

