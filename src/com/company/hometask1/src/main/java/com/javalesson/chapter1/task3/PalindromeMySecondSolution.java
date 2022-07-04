package com.javalesson.chapter1.task3;

import java.util.Objects;
import java.util.Scanner;

public class PalindromeMySecondSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "1";
        int num1 = 0;

        while (str1.length() != 5) {
            System.out.println("Please enter 5 digits");
            num1 = scanner.nextInt();
            str1 = String.valueOf(num1);
        }

        polindromSecondCheck(num1);
    }

    public static void polindromSecondCheck(int num) {

        int numN = num;
        int numM = num;
        int count = 0;

        for (int i = 1; i < 3; i++) {
            int n = numN / (int) Math.pow(10, 5 - i);
            int m = numM % (int) Math.pow(10, 1);

            numN = (int) (numN % Math.pow(10, 5 - i));
            numM = (int) (numM / Math.pow(10, 1));

            if (Objects.equals(n, m)) {
            count++;
                System.out.println("count = " +count);
            }
        }
        if (count == 2){
            System.out.println(num+ " IS polindrom");
        } else {
            System.out.println(num+ " IS not polindrom");
        }
    }
}

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 * <p>
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * <p>
 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */
