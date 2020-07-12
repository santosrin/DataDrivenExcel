package com.repractice;

import java.util.Arrays;

public class MoveZeroesToEnd {
public static void move0ToEnd(int a[]) {
    int k = 0;
    for(int i = 0;i<a.length;i++) {
        if(a[i]!=0) {
            a[k++] = a[i];
        }
    }

    for(int i = k ;i<a.length;i++) {
        a[i] = 0;
    }
}

    public static void main(String[] args) {
        int[] arr = {6,0,0,4,5,4,1,0,4};
        move0ToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
