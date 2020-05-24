package com.morepractice;

public class BinaryToDecimal {


    public static long convertBinaryToDecimal(long num) {

            long decimanNum = 0, i = 0;
            while (num != 0) {
                long reminder = num % 10;
                decimanNum = (long) (decimanNum + reminder * Math.pow(2, i));
                ++i;
                num = num / 10;
            }
            return decimanNum;
        }


    public static void main(String[] args) {

        long decimal = convertBinaryToDecimal(10011011);
        System.out.println(decimal);
    }
}