package com.repractice;

public class DecimanToOctal {

    public static int DecToOct(int num) {

        int rem = 1,i=1;
        int decToOct = 0;
        while(num!=0) {
            rem = num%8;
            decToOct = decToOct + rem*i;
            i*=10;
            num = num/8;
        }
        return decToOct;
    }

    public static void main(String[] args) {
        System.out.println(DecToOct(51));
    }
}
