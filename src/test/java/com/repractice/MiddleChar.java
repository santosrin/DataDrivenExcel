package com.repractice;

public class MiddleChar {
   public static String middleChar(String str) {
       int length = 0 , position =0;
       if(str.length()%2 == 0){
           position = str.length()/2 -1;
           length = 2;
       } else {
           position = str.length()/2;
           length = 1;
       }
       return str.substring(position, position+length);
   }

    public static void main(String[] args) {

        System.out.println(middleChar("abcde"));

    }
}
