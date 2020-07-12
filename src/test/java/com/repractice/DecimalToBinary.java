package com.repractice;

public class DecimalToBinary {

    public static int decimalToBinary(int num) {
        int rem = 1;
        int i = 1;
        int binNum = 0;
        while(num!=0) {
            rem = num%10;
            binNum = binNum + rem*i;
              i = i*10;
              num = num/10;
        }
        return binNum;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(155));
    }
}
