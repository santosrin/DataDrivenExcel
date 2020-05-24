package com.morepractice;

public class NatualNumberSum {
    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        //int sum = (num*(num+1))/2;


        for(int i=1;i<=num ; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
