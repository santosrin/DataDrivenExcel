package com.morepractice;

public class FactorialRecusive {

    public static int multiplyNumbers(int num) {
        if(num >= 1) {
            return (num * multiplyNumbers(num-1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(multiplyNumbers(3));
    }
}
