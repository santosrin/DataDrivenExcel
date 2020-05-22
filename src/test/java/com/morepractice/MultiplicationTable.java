package com.morepractice;

public class MultiplicationTable {

    public static void main(String[] args) {

//        int num = 13;
        logic(13);
    }

    private static void logic(int num) {
        for(int i =1; i<=10;i++) {
            System.out.println(num +"*" + i + "=" + (num*i));
        }
    }
}
