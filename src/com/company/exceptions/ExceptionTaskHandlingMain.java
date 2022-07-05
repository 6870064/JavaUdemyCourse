package com.company.exceptions;
import java.util.Scanner;

public class ExceptionTaskHandlingMain {

    public static void main(String[] args) {

        boolean continueLoop = true;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter A parameter");
                int a = scanner.nextInt();
                System.out.println("Please enter B parameter");
                int b = scanner.nextInt();
                System.out.println("Please enter C parameter");
                int c = scanner.nextInt();
                System.out.println(counter(a, b, c));
                continueLoop = false;
            } catch (ArithmeticException | InvalidInputParamException e) {
                System.out.println("Exception : " +e);
                System.out.println("Only non-zero parameters are allowed");
            }
        } while (continueLoop);
    }

    public static int counter(int a, int b, int c) {
        return (a + b) / c;
    }
}