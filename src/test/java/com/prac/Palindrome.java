package com.prac;

public class Palindrome {

    public static void isPalinDrome(int num) {

        int r =0;
        int sum =0;
        int t;

        t= num;
        while(num > 0) {
            r= num%10; // get the reminder
            sum = (sum*10) + r;
            num = num/10;
        }

        if(t == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }

    }

    public static void main(String[] args) {
        isPalinDrome(11);
    }
}
