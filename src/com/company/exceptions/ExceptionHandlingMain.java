package com.company.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {

    public static void main(String[] args) {
        try {
            doEverything();
        } catch (InvalidInputParamException e) {
            System.out.println("InvalidInputParamException");
            e.printStackTrace();
        }
    }

    public static void doEverything() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try (PrintWriter writer = new PrintWriter(new FileWriter("out.txt"))) {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
//                int[] intArray = new int[1];
//                int i = intArray[2];
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open the file");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("All Exceptions here");
                throw new InvalidInputParamException("Array index out of bound. thrown in doEverything" + e);
            } finally {
                System.out.println("Finally block is called");
//                if (writer != null) {
//                    writer.close();
//                }
            }
            System.out.println("Try catch block is finished");
        } while (continueLoop);

    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException {
        return numerator / denominator;
    }

    private static void safeToFile(int res) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
        writer.println("Result = " + res);
        writer.close();
    }
}
