package com.morepractice;

public class NaturalNumbersRecursion {

    public static int addNum(int num) {
        if(num!= 0) {
            return num + addNum(num-1);
        } else {
            return num;
        }
    }

    public static void main(String[] args) {

        int num = 10;
        int sum = addNum(num);
        System.out.println(sum);
    }
}
