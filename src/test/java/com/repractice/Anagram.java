package com.repractice;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1 , String s2) {
        Boolean status = false;
        if(s1.length() != s2.length()) {
            return false;
        } else {
            char[] s1array = s1.toLowerCase().toCharArray();
            char[] s2array = s2.toLowerCase().toCharArray();
            Arrays.sort(s1array);
            Arrays.sort(s2array);
            status =  Arrays.equals(s1array,s2array);
        }
        return status;
    }

    public static void main(String[] args) {
        Boolean isAnagram = isAnagram("Keep","Peek");
        System.out.println(isAnagram);
    }
}
