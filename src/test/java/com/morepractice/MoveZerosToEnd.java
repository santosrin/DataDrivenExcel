package com.morepractice;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void reorder(int[] A) {
        int k = 0;
        for(int i:A) {
            if(i!=0) {
                A[k++] = i;
            }
        }
        System.out.println(k);
        for(int i=k;i<A.length;i++) {
            A[i]=0;
        }
    }
    public static void main(String[] args) {
        int a[] = {6, 0, 8, 2, 3, 0, 4, 0, 1};
        reorder(a);
        System.out.println(Arrays.toString(a));

    }

}
