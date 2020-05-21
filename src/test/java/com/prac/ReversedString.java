package com.prac;

public class ReversedString {

    public static void main(String[] args) {

        String s = "Hello Tome I am here"; // string is immutable object (cannot change)

        //1. Using for loop
        int len = s.length();
        String rev = "";

        for(int i = len-1 ; i >= 0 ; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        //2. String buffer class
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());


    }
}
