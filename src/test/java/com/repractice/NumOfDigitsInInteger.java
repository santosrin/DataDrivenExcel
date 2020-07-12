package com.repractice;

public class NumOfDigitsInInteger {

    public static void main(String[] args) {
        int num = 12345849;
        int cnt = 0;
        while (num!= 0) {
            num = num/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
