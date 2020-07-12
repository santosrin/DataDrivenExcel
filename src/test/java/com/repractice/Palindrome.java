package com.repractice;

public class Palindrome {

    public static boolean isPalin(String str)  {
        String rev = "";
        String temp = str;
        for(int i = str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(temp.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "dad";
        boolean status = isPalin(str);
        System.out.println(status);
    }
}
