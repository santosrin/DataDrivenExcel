package com.prac;

import java.util.Arrays;

public class SmallLargeNumberInArray {

    public static void main(String[] args) {

        int numbers[] = {-100,-10,24,5,50,-88,98847,98848};
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 1;i<numbers.length;i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            } else if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("\n given array is: "+ Arrays.toString(numbers));
        System.out.println("largest number is:: "+ largest);
        System.out.println("smallest number is:: "+ smallest);
    }
}
