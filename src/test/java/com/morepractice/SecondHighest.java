package com.morepractice;

public class SecondHighest {

    public static void main(String[] args) {
        int arr[] = {10,1,4,-1,10,6,7,10};
        //int arr[] = {10,10,10};
        int first =0,second = 0;
        if(arr.length < 2) {
            System.out.println("Enter array with more than 2 values");
            return;
        }

        for(int i =0;i<arr.length;i++) {
            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } else if(arr[i] > second && arr[i]!= first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
