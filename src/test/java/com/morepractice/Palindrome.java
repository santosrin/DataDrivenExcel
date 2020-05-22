package com.morepractice;

public class Palindrome {

    public static void main(String[] args) {

        int num = 1331;
        int rev = 0;

        int temp = num;
        while(num != 0) {
            int n = num%10;
            rev = rev *10 + n;
            num = num/10;
        }

        if(temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
