package com.prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {

        String name[] = {"Java","Java Script","C","Ruby","Java","Python","C"};

        //1. Compare each element (O(n*n))
        for(int i=0;i<name.length;i++) {
            for(int j=i+1;j<name.length;j++) {
                if(name[i].equals(name[j])) {
                    System.out.println("Duplicate element : "+ name[i]);
                }
            }
        }

        //2. Hashset - part of java collection - stores unique values - O(n)
//
//        Set<String> store1 = new HashSet<>();
//        for(String names1:name) {
//            if(store1.add(names1) == false) {
//                System.out.println("Duplicate : " +names1);
//            }
//        }

        Set<String> store = new HashSet<String>();
        for(String names :name) {
            if(store.add(names) == false) {
                System.out.println("Duplicate element set : "+ names);
            }
        }

        Set<String> store1 = new HashSet<>();
        for(String names1 : name){
            if(store1.add(names1) == false) {
                System.out.println("Duplicate : "+ names1);
            }
        }

        //3. HashMap
        Map<String , Integer> storeMap = new HashMap<>();

        for(String names: name) {
            Integer count = storeMap.get(names);
            if(count == null) {
                storeMap.put(names,1);
            } else {
                storeMap.put(names,++count);
            }
        }

        //get the values from hashmap O(2n)
       Set<Map.Entry<String ,Integer>> entrySet =  storeMap.entrySet();
        for(Map.Entry<String ,Integer> entry : entrySet) {
            if(entry.getValue() > 1) {
                System.out.println("duplicate element is :"+ entry.getKey());
            }

        }


    }
}
