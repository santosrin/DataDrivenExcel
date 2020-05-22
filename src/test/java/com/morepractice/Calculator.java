package com.morepractice;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();


        System.out.println("Enter Operator : (+ , - , *, /)");
        char operator = scanner.next().charAt(0);

        double result =0;

        switch (operator) {
            case '+' :
                result = firstNum + secondNum;
                break;
            case '-' :
                result = firstNum - secondNum;
                break;
            case '*' :
                result = firstNum * secondNum;
                break;
            case '/' :
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("Please pass the correct operator");
                break;
        }

        System.out.println(result);

    }
}
