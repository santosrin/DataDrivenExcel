package com.prac;

public class palindromestring {

    public static void palindrome(String str) {

        String rev = "";
        String temp = str;
        System.out.println(temp);
        for(int i= str.length()-1 ; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if(rev.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome("tom");
    }
}
