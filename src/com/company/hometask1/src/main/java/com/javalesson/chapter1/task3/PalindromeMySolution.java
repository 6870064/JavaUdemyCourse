package com.javalesson.chapter1.task3;

import java.util.Scanner;

public class PalindromeMySolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str1 = "1";

        while (str1.length() != 5) {
            System.out.println("Please enter 5 digits");
            str1 = String.valueOf(scanner.nextInt());
        }
        polindromCheck(str1);
    }

    public static void polindromCheck(String str) {
        int m = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            String substr1 = str.substring(i, i + 1);
            String substr2 = str.substring(str.length() - (i + 1), str.length() - i);
            if (substr1.equals(substr2)) {
                m++;
            }
        }
        int Int = Integer.parseInt(str);
        if (m == str.length() / 2) {
            System.out.println(Int + " is polindrom");
        } else {
            System.out.println(str + " is NOT polindrom");
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

 * 2) Решение с помощью щю использования остатка от деления на 10.
 * <p>
 * Вам нужно выполнить задания двумя способами.
 */