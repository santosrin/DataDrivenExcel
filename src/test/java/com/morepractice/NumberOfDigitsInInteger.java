package com.morepractice;

public class NumberOfDigitsInInteger {

    public static void main(String[] args) {

        int num = 12345679;
        int count =0 ;

        while (num!=0) {
            num = num/10;
           count++;
        }
        System.out.println(count);
    }
}
