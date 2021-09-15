package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        //loop
        for(i = 0; i <= newArray.length; i++){
            x = newArray[i];
            System.out.println(x + " ");
        }

    }
}
