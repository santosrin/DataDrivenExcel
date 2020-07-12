package com.repractice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

    public static void dupWord(String str) {
        String[] word = str.split(" ");
        HashMap<String,Integer> words = new HashMap<>();

        for(String word1 : word) {
            if(words.containsKey(word1)) {
                words.put(word1,words.get(word1)+1);
            } else {
                words.put(word1,1);
            }
        }

        Set<String> key =  words.keySet();
        for (String key1 : key) {
            if(words.get(key1) > 1) {
                System.out.println(key1 + " " + words.get(key1));
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hi Hi Java Mava Java";
        dupWord(str);
    }
}
