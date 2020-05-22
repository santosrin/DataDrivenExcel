package com.morepractice;

public class VowelConsonant {

    public static void main(String[] args) {
        char ch = 'u';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u') {
            System.out.println("Vowel");
        } else
        {
            System.out.println("Consonant");
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }

    }
}
