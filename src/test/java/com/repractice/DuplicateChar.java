package com.repractice;

public class DuplicateChar {

    public static void main(String[] args) {

        String str = "abacfghttuyii";
        char[] ch = str.toCharArray();
        int cnt = 0;
        for(int i = 0;i<str.length();i++) {
            for(int j = i+1;j<str.length();j++) {
                if(ch[i] == ch[j]){
                    cnt++;
                    System.out.println("Duplicate char : "+ ch[j]);
                    break;
                }

            }

        }
    }
}
