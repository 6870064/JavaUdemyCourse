package com.controlstatement;

public class Controls {
    public static void main(String[] args) {

        int testScore = 57;
        if (testScore >= 90) {
            System.out.println("Your mark is " + testScore + " and You passed the exam Excellent");
        } else if (testScore >= 70 && testScore <= 89) {
            System.out.println("Your mark is " + testScore + " and You passed the exam well");
        } else if (testScore >= 58 && testScore <= 69) {
            System.out.println("Your mark is " + testScore + " and You passed the exam satisfactory");
        } else {
            System.out.println("Your mark is " + testScore + " and You didn't pass the exam");
        }
    }

}
