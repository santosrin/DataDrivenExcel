package com.repractice;

public class AmstrongNumber {

    public static void amsNum(int num) {
        int val = 0;
        int temp = num;
        while (num!=0) {
            int rem = num%10;
             val = val + rem*rem*rem;
             num = num/10;
        }

        if(temp==val) {
            System.out.println("Amstrong");
        } else {
            System.out.println("Not Amstrong");
        }
    }

    public static void main(String[] args) {
        amsNum(153);
    }
}
