package com.repractice;

public class NaturalNumberRecursion {

    public static int natNum(int num) {
        if(num <= 0) {
            return num;
        } else {
            return (num + natNum(num-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(natNum(-1));
    }
}
