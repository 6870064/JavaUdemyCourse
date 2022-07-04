package com.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = "Wednesday";
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("It's monday and time to go at work bitch");
                break;
            case "tuesday":
                System.out.println("It's tuesday and time to go at work bitch");
                break;
            case "wednesday":
                System.out.println("It's wednesday and time to go at work bitch");
                break;
            case "thursday":
                System.out.println("It's thursday and time to go at work bitch");
                break;
            case "friday":
                System.out.println("It's friday and time to go at work bitch");
            case "saturday": case "sunday":
                System.out.println("It's week end and you can stay home bitch");
            default:
                System.out.println("You didn't chose day of the week bitch");
        }
        System.out.println("Final String for you bitch");
    }
}
