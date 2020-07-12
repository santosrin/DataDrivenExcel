package com.repractice;

public class BinaryToDecimal {

    public static int binaryToDecimal(int num) {
        double decimalNo = 0;
        int i=0;
        while(num!=0) {
           long  reminder1 = num%10;
            decimalNo = decimalNo + reminder1*Math.pow(2,i);
            i++;
            num = num/10;
        }
        return (int) decimalNo;
    }
    public static void main(String[] args) {
        int val = binaryToDecimal(10011011);
        System.out.println(val);
    }
}
