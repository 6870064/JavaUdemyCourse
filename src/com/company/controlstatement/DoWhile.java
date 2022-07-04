package com.controlstatement;

public class DoWhile {
    public static void main(String[] args) {
        int finalBalance = 1000000;
        double currentBalance = 0;
        int deposit = 10000;
        int years = 0;
        double interestRate = 0.1;

        do {
            currentBalance += deposit;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("current amount of years is " + years + ". Current balance is " + currentBalance);
        } while (currentBalance < finalBalance && years < 15);
    }
}
