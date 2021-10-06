package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names = new String[]{"Jermell", "James", "John"};
        int[] intArray = new int[]{1,2,3,4,5,6};
        int[] newArray = new int[]{2,4,6,8,10,12};
        int i, x;
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(names));

        //Try Fizzbuzz
        for (i = 0; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("Fizzbuzz");
            } else if((i % 3 == 0)){
                System.out.println("Fizz");
            } else if((i % 5 == 0)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //boolean
        int a = 5;
        int b = 3;
        boolean answer = a > b;
        boolean answer2 = b > a;
        System.out.println(answer);
        System.out.println(answer2);


        boolean numAnswer = a == 7 || b == 5;
        System.out.println(numAnswer);

        if( a > 3){
            System.out.println("A is greater than 3.");
        }
        else {
            System.out.println("A is less than 3.");
        }

        //Loops
        for(i = 0; i<10; i++ ){
            System.out.println("Hello");
        }

        while(a<10){
            System.out.println("Jermell");
            break;
        }

        //Do while loop
        do {
            System.out.println("Awesome");
        } while (a<5);

        //Getting User input
//        System.out.println("Please enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int solution = scanner.nextInt();
//        System.out.println("Answer was: " + solution);
//        System.out.println("Enter your name: ");
//        String name = scanner.next();
//        System.out.println("Hello " + name);

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("number: " + number);
    }
}
