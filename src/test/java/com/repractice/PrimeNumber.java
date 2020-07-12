package com.repractice;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        boolean flag = true;
        if(num <=1) {
            return false;
        }
        for(int i = 2;i<=num/2;i++) {
            if(num%i == 0) {
                flag =  false;
                break;
            }
        }
      return flag;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(isPrime(num));

        boolean flag = false;
        for(int i=2;i<=num/2;i++) {
            if((isPrime(i))) {
                if(isPrime(num-i)) {
                    System.out.println(num + "=" + i +"+" + (num-i)) ;
                    flag = true;
                }
            }
        }
        if(!flag) {
            System.out.println("Nope");
        }
        }

}
