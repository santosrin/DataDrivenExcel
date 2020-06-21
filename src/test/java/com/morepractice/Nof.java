package com.morepractice;

public class Nof {
    public static void main(String[] args) {
        int a[] = {1,3,4,1,2,6,7};
        int count = 0;
        int x = 1;
        for(int i =0;i<a.length;i++) {
            if(x == a[i])
                count++;
        }
        System.out.println(x+" : "+count);
    }
}
