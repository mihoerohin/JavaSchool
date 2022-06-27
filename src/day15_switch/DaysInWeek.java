package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter a day number 1-7:");
        int day = input.nextInt();
        String weekDay = "";

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("incorrect number");
                break;
        }
        System.out.println("----------------------");
        switch (day){
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "incorrect number";
                break;

        }
        System.out.println(weekDay);

    }
}
