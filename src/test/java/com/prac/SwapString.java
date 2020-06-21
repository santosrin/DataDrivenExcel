package com.prac;

public class SwapString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println(b.substring(1));
        System.out.println("Before Swapping: ");
        System.out.println(a);
        System.out.println(b);

        // 1. append
        a = a+b;

        //2. store initial string a in string b
        b = a.substring(0,a.length()- b.length());

        //3. store initial string b in string a
        a = a.substring(b.length());

        System.out.println("After Swapping: ");
        System.out.println(a);
        System.out.println(b);


    }
}
