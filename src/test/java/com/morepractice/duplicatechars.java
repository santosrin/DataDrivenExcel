package com.morepractice;

public class duplicatechars {

    public static void main(String[] args) {
        String a = "abcadbr";
        int cnt = 0;
        char[] ch = a.toCharArray();
        for(int i=0; i<a.length(); i++) {
            for(int j = i+1; j<a.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.println("Duplicate chars are: "+ ch[j]);
                    cnt++;
                    break;
                }
            }
        }
    }
}
