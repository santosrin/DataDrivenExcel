package com.morepractice;

public class DecimalToOctal {

    public static int decimalToOctal(int num) {
            int on = 0,i=1;
            while (num!=0){
                int rem = num%8;
                on = on + rem*i;
                i = i*10;
                num = num/8;
            }
            return on;
    }

    public static void main(String[] args) {

        System.out.println(decimalToOctal(109));
    }

}
