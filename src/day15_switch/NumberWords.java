package day15_switch;

import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n == 1) {
            System.out.println("one");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 5) {
            System.out.println("five");
        } else {
            System.out.println("Invalid number");

        }

        
        System.out.println("*******************************************");
        switch (n) {
            case 1:     // ==> if(n == 1){
                System.out.println("one from SWITCH");
                break;
            case 2:
                System.out.println("two from SWITCH");
                break;
            case 3:
                System.out.println("three from SWITCH");
                break;
            case 4:
                System.out.println("four from SWITCH");
                break;
            case 5:
                System.out.println("five from SWITCH");
                break;
            default:
                System.out.println("Invalid number from SWITCH");
                break;

        }

        System.out.println("*******************************************");
        switch (n) {
            case 1:     // ==> if(n == 1){
                System.out.println("one");

            case 2:
                System.out.println("two");

            case 3:
                System.out.println("three");
                
            case 4:
                System.out.println("four");

            case 5:
                System.out.println("five");

            default:
                System.out.println("Invalid number from SWITCH");
                break;
        }
    }
}
