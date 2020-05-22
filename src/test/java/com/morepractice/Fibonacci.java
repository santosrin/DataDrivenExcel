package com.morepractice;

public class Fibonacci {

    public static void main(String[] args) {

        int num = 20;
        Fibo(num);
    }

    private static void Fibo(int num) {
        int t1 = 0;
        int t2 = 1;

        for(int i = 1 ; i<=num; i++) {
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
