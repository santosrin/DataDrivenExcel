package com.prac;

public class Factorial {

    //without recursion  - use for look
    public static void factorial(int num){
        int sum=1;
        for(int i = 1 ;i<=num; i++) {
            sum = sum*i;
        }
        System.out.println(sum);
    }


    //with recursive function - function calling itself
    public static  int fact1(int num) {
        if(num == 0) {
            return 1;
        } else {
            return (num * fact1(num-1));
        }
    }


    public static void main(String[] args) {
        factorial(0);
        System.out.println(fact1(4));
    }
}
