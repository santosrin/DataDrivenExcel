package com.repractice;

public class OctalToDecimal {

    public static double octToDec(int num) {

        double decNo=0,i=0;
        while (num!=0) {
            int rem = num%10;
            decNo = decNo + rem * Math.pow(8,i);
            i++;
            num = num/10;
        }
        return decNo;
    }
    public static void main(String[] args) {
        System.out.println(octToDec(116));
    }
}
