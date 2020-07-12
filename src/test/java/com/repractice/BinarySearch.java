package com.repractice;

public class BinarySearch {

    public static int binarySearch(int arr[], int x , int first , int last) {
        int mid;
        if(arr.length<1) {
            System.out.println("Invalid array");
        }
        for(int i=0;i<arr.length;i++){
            mid = first+last/2;
            if(arr[mid]== x) {
                return mid;
            } else if(x < arr[mid]) {
                //mid = (first +(mid-1))/2;
                return binarySearch(arr,x,first,mid-1);
            } else if(x > arr[mid]) {
               // mid = ((mid+1) + last)/2;
                return binarySearch(arr,x,mid+1,last);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int x = 6;
        int first = arr[0];
        int last = arr.length-1;
        System.out.println(binarySearch(arr,x,first,last));
    }
}
