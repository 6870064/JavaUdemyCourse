package com.javalesson.chapter1.task1;

import java.util.Scanner;

public class TriangleMySolution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side A of the Triangle");
        int x = scanner.nextInt();

        System.out.println("Enter the side B of the Triangle");
        int y = scanner.nextInt();

        System.out.println("Enter the side C of the triangle");
        int z = scanner.nextInt();

        if (enteredValueCheck(x, y, z) == true && triangleExistCheck(x, y, z) == true) {
            triangleRuleCheck(x, y, z);
            isoscelesTriangleCheck(x, y, z);
            equilateralTriangleCheck(z, y, z);
            rightTriangle(x, y, z);
        }
    }

    public static boolean enteredValueCheck(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            return true;
        } else
            System.out.println(String.format("The triangle with the parameters %d, %d, %d DOESN'T EXIST 1 ", x, y, z));
        return false;
    }

    public static boolean triangleExistCheck(int x, int y, int z) { // метод на проверку существование самого треугольника

        if (x < y + z || y < x + z || z < x + y) {
            return true;
        } else {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d DOESN'T EXIST 2", x, y, z));
            return false;
        }
    }

    public static void triangleRuleCheck(int x, int y, int z) { // метод на проверку выполнения правила треугольника

        if (x < y + z || y < x + z || z < x + y) {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d EXIST", x, y, z));
        } else {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d DOESN'T EXIST 2", x, y, z));
        }
    }

    public static void isoscelesTriangleCheck(int x, int y, int z) {//метод на проверку равнобедренного треугольника

        if (x == y || x == z || y == z) {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d is ISOSCELES triangle", x, y, z));
        }
    }

    public static void equilateralTriangleCheck(int x, int y, int z) { //метод на проверку равностороннего треугольника
        if (x == y && x == z && y == z) {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d is EQUILATERAL " +
                    "triangle", x, y, z));
        }
    }

    public static void rightTriangle(int x, int y, int z) { //проверка на прямоугольный треугольник

        if (x * x == y * y + z * z || y * y == x * x + z * z || z * z == x * x + y * y) {
            System.out.println(String.format("The triangle with the parameters %d, %d, %d is RIGHT " +
                    "triangle", x, y, z));
        }
    }
}

/**
 * Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 * сторонами треугольника. а также равнобедренного, равностороннего и прямоугольного треугольника
 * Для ввода значений с консоли Вам понадобится класс Scanner.
 * <code>Scanner scanner = new Scanner(System.in);</code>
 * <code>scanner.nextInt();</code>
 */