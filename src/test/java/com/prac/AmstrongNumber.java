package com.prac;

public class AmstrongNumber {

    public static void isAmstrong(int num){
        int cube = 0 , r , t;

        t = num;
        while(num > 0) {
            r = num%10;
            cube = cube+(r*r*r);
            num = num/10;
        }
        if(t == cube) {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not Amstrong Number");
        }
    }

    public static void main(String[] args) {
        isAmstrong(153);
    }
}
