package com.repractice;

public class SecondHighestNumber {

    public static void main(String[] args) {

//        int a[] = {1,4,10,-1,0,20,10};
        int a[] = {10,10,9};
        int first = 0;
        int second = 0;
        if(a.length <2 ) {
            System.out.println("Enter array size of 2 or more");
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]>first) {
                second=first;
                first = a[i];
            } else if(a[i]>second && a[i]!= first) {
                second=a[i];
            }
        }
        System.out.println(second);
    }
}
