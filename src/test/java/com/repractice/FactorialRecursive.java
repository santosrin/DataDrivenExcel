package com.repractice;

public class FactorialRecursive {
   public static int factRec(int num) {
//       if(num <= 1) {
//           return 1;
//       } else {
//           return (num*factRec(num-1));
//       }
       int sum = 1;
       for(int i = 1;i<= num;i++) {
            sum = sum*i;
       }
      return sum;
   }

    public static void main(String[] args) {
        System.out.println( factRec(4));
    }
}
