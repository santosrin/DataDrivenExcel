package com.morepractice;

public class DecimalToBinary {

    public static long convertDecimalToBinary(int n) {
        long binaryNum = 0;
        int remainder = 1,i=1;

        while (n!=0) {
            remainder = n%2;
            binaryNum = binaryNum + remainder*i;
            i=i*10;
            n = n/2;

        }
        return binaryNum;

    }

    public static void main(String[] args) {
        long binary = convertDecimalToBinary(156);
        System.out.println(binary);
    }
}
