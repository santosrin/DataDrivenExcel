package com.repractice;

public class MissingArrayNumber {

    public static void main(String[] args) {
        int a[] = {-1,1,2,3,4,6,7,8,9,10}; // should be sorted
        int num = 0;
        for(int i =0;i<a.length;i++) {
            num = num + a[i];
        }

        int num1 = 0;
        for(int i = -1;i<=10;i++) {
            num1 = num1 +i;
        }

        System.out.println("Missing Number : "+ (num1-num));
    }

}
