package com.prac;

public class PrimeNumber2 {

    public static boolean isPrime(int num) {
        if (num <=1 )
            return false;
        for(int i=2;i<=num/2;i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNumbers(int num) {
        for(int i=2;i<=num;i++) {
            int count = 0;
            if(isPrime(i)) {
                System.out.println(" "+ i);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(19));
        getPrimeNumbers(19);
    }
}
