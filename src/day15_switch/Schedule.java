package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Schedule Cydeo classes\nEnter a day:");
        String day = input.next();
        String weekDay = "";

        switch (day) {
            case "Monday":
            case "monday":
            case "mon":
                weekDay = "Monday 7pm to 10om\nJava class\nTeacher: Saim S";
                break;
            case "Tuesday":
            case "tuesday":
            case "tues":
                weekDay = "Tuesday 7pm to 10pm\nJava class\nTeacher: Saim S";
                break;
            case "Wednesday":
            case "wednesday":
            case "wed":
                weekDay = "Wednesday 7pm to 10pm\nJava class\nTeacher: Saim S";
                break;
            case "Thursday":
            case "thursday":
            case "thu":
                weekDay = "Thursday 7pm to 10pm\nJava class\nTeacher: Nadir A";
                break;
            case "Friday":
            case "friday":
            case "fr":
                weekDay = "Friday, day off";
                break;
            case "Saturday":
            case "saturday":
            case "sat":
                weekDay = "Saturday 10am to 5pm\nJava class\nTeacher: Saim S";
                break;
            case "Sunday":
            case "sunday":
            case "sun":
                weekDay = "Sunday 10am to 5pm\nJava class\nTeacher: Saim S";
                break;
            default:
                weekDay = "incorrect number";
                break;
        }
        System.out.println(weekDay);
        System.out.println("" +
                "--------------------------------");
        switch (day) {
            case "Monday":
            case "monday":
            case "mon":

            case "Tuesday":
            case "tuesday":
            case "tues":

            case "Wednesday":
            case "wednesday":
            case "wed":

            case "Thursday":
            case "thursday":
            case "thu":
                weekDay = "7pm to 10pm\nJava class\nTeacher: Saim S";
                break;

            case "Friday":
            case "friday":
            case "fr":
                weekDay = "Friday, day off";
                break;

            case "Saturday":
            case "saturday":
            case "sat":
            
            case "Sunday":
            case "sunday":
            case "sun":
                weekDay = "Sunday 10am to 5pm\nJava class\nTeacher: Saim S";
                break;
            default:
                weekDay = "incorrect number";
                break;
        }
        System.out.println(weekDay);

    }
}
