package com.Learnings;

import java.util.Arrays;

public class Anagram1 {

    public static void isAnagram(String s1,String s2) {
        int slen1 = s1.length() ;
        int slen2 = s2.length();
        boolean status = false;
        if(slen1 != slen2) {
            System.out.println("Not Anagram");
        } else {
            char[] str1 = s1.toLowerCase().toCharArray();
            char[] str2 = s2.toLowerCase().toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            status = Arrays.equals(str1, str2);
        }
        if(status) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    public static void main(String[] args) {
        String s1 = "Peek";
        String s2 = "Keea";
        isAnagram(s1,s2);
    }
}
