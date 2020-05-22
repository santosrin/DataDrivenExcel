package com.morepractice;

public class LargestAmong3Numbers {

    public static void main(String[] args) {

        int x = 1000;
        int y = 1000;
        int z = 1000;

        if(x>=y && x >= z) {
            System.out.println("x is greatest");
        } else if(y>=z) {
            System.out.println("y is greatest");
        } else {
            System.out.println("z is greatest");
        }


    }
}
