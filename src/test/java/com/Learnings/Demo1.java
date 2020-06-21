package com.Learnings;

public class Demo1 {

    public static void main(String[] args) {
//        System.out.println("2"+"2"-"2");

       int arr[] = {1,2,2,3,4,5,6,7,8,8};
        //int arr[] = {};
        int first = arr[0];
        int last = arr.length-1;
        int mid = 0;
        int x = 1;

        System.out.println(binarySearch(arr, first, last, x));
    }

    private static int binarySearch(int[] arr, int first, int last, int x) {
        int mid;
        if (arr.length < 1) {
            System.out.println("Invalid array");
        }
        for(int i = 0; i <arr.length; i++) {
            mid = (first + last)/2;
            if(arr[mid] == x) {
               return mid;
            } else if(x < arr[mid]) {
//                mid = (first + (mid-1))/2;
                return binarySearch(arr,first ,mid-1,x);
            } else if(x > arr[mid]) {
//                mid = ((mid+1) + last)/2;
                return binarySearch(arr,mid+1,last,x);
            }
        }
       return -1;
    }

}
