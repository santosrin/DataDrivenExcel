package com.repractice;

public class PrimeNoInRange {

    public static void main(String[] args) {
        int low = 20;
        int high = 50;

        while (low<high) {
            boolean flag = true;
            for(int i = 2;i<low/2;i++) {
                if(low%i==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(low + " ");
            }
            low++;
        }
    }
}
