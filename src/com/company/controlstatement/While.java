package com.controlstatement;

public class While {
    public static void main(String[] args) {
        int finalBalance = 100000;
        double currentBalance = 0;
        int deposit = 10000;
        int years = 0;
        double interestRate = 0.1;

        while (currentBalance <finalBalance) {
            currentBalance += deposit;
            currentBalance = currentBalance + currentBalance*interestRate;
            years++;
            System.out.println("current amount of years is " +years+ ". Current balance is " +currentBalance);
        }
    }
}
