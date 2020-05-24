package com.morepractice;

public class OctalToDecimal {


    public static double octalToDecimal(int octalNum) {
        double decNum =0,i=0;
        while (octalNum!=0) {
            int rem = octalNum%10;
            decNum = decNum + rem * Math.pow(8,i);
            ++i;
            octalNum = octalNum/10;
        }

        return decNum;
    }
    public static void main(String[] args) {
        System.out.println(octalToDecimal(116));
    }
}
