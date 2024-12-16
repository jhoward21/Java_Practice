package com.company;

public class Practice2 {
    public static void main (String[] args) {
        String AddressLineOne = "Biff Arfuss";
        String AddressLineTwo = "101 Main St.";
        String AddressLineThree = "St. Louis, MO 63136";

        System.out.println(AddressLineOne);
        System.out.println(AddressLineTwo);
        System.out.println(AddressLineThree);

        //Defining the Array
        int[] simpleNum = {1,2,3,4,5};

        //Creating/Calling the method to find the second largest number
        int secondLargest = findSecondLargestNum(simpleNum);
        //Print Result to the Console
        System.out.println("The second largest number is " + secondLargest);
    }

    public static int findSecondLargestNum (int[] simpleNum) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < simpleNum.length; i++) {
            if (simpleNum[i] > largest) {
                //Update the second largest number before the largest one
                secondLargest = largest;
                largest = simpleNum[i];
            } else if (simpleNum[i] > secondLargest && simpleNum[i] != largest) {
                secondLargest = simpleNum[i];
            }
        }
        return secondLargest;
    }

    //Finding the largest Number in the array
//    public static int findLargestNum (int[] simpleNum) {
//        int largest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < simpleNum.length; i++) {
//            if (simpleNum[i] < largest) {
//                largest = simpleNum[i];
//            }
//        }
//        return largest;
//    }
}
