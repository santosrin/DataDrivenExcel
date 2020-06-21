package com.morepractice;

import java.util.Arrays;

public class Anagram {

public static void isAnagram(String str1,String str2) {
    int str1len = str1.length();
    int str2len = str2.length();
    boolean status = false;
    if(str1len != str2len) {
        status = false;
    } else {
        char[] str1Arr = str1.toLowerCase().toCharArray();
        System.out.println(str1Arr);
        char[] str2Arr = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        status = Arrays.equals(str1Arr,str2Arr);
    }
    if(status) {
        System.out.println(str1 +" and "+ str2 + " are anagrams");
    } else {
        System.out.println(str1 +" and "+ str2 + " are not anagrams");
    }
}

    public static void main(String[] args) {
        isAnagram("Mother InLaw","Hitler Woman");
    }
}
