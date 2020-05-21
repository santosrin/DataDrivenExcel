package com.prac;

public class SwapVar {

    public static void main(String[] args) {

        int x =5;
        int y = 10;

        //with using third variable
//        int t ;
//        t = x;
//        x=y;
//        y=t;

        System.out.println(x +" : "+ y);

        //without temp
//        x = x + y;
//        y = x - y;
//        x = x - y;

        //using * operator
//        x = x *y;
//        y = x/y;
//        x = x/y;

        //using XOR operator
        x = x ^ y ;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x +" : "+ y);


    }
}
