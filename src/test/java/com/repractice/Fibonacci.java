package com.repractice;

public class Fibonacci {

    public static void fibo(int num) {
        int n1 = 0;
        int n2 = 1;
       for(int i = 1;i<=num;i++) {
           System.out.println(n1);
           int sum = n1+n2;
           n1 = n2;
           n2=sum;
       }
    }
    public static void main(String[] args) {
        fibo(10);
    }
}
