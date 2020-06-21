package com.morepractice;

public class LargestAmong3Numbers {

    public static void main(String[] args) {

        int x = 10000;
        int y = 2000000;
        int z = 3000;

        if(x>=y && x >= z) {
            System.out.println("x is greatest");
        } else if(y>=z) {
            System.out.println("y is greatest");
        } else {
            System.out.println("z is greatest");
        }


    }
}
