package com.morepractice;

public class QuotientReminder {

    public static void main(String[] args) {

        int dividend = 30;
        int divisor = 4;

        int quotient = dividend/divisor;
        int reminder = dividend%divisor;

        System.out.println(quotient + " " + reminder);
    }
}
