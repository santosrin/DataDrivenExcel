package com.repractice;

public class PowerOfANumber {

    public static void main(String[] args) {

        int base = 3;
        int exponent = 4;
        System.out.println(Math.pow(3,4));

        int result = 1;
        while(exponent!=0){
            result= result*base;
            --exponent;
        }
        System.out.println(result);
    }
}
