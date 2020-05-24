package com.morepractice;

public class CheckPrimeNumber {

    public static boolean checkPrimeNumber(int num) {
        boolean inPrime = true;
        if(num <=1) {
            System.out.println("Not a Prime Number");
        }
        for(int i=2 ; i<=num/2 ;i++) {
            if(num%i == 0) {
                inPrime = false;
                break;
            }
        }
        return inPrime;
    }

    public static void main(String[] args) {
        int num = 10;
        boolean flag = false;

        for(int i = 2 ;i<= num/2 ; i++) {
            if(checkPrimeNumber(i)) {
                if(checkPrimeNumber(num-i)) {
                    System.out.println(num +" = "+ i + "+" + (num-i));
                    flag=true;
                }
            }

        }

        if(!flag) {
            System.out.println(num +" can not be exressed as sum of two prime numbers");
        }
        //System.out.println(checkPrimeNumber(1));
    }
}
