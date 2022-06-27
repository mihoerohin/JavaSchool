package day16_switch;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many minutes are lef in the game");
        int minutes = input.nextInt();

        if (minutes >= 0 && minutes <= 90) {
            if (minutes >= 75) {
                System.out.println("Game just getting started");
            } else if (minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the the game going great");
            } else {
                System.out.println("The end the game is approaching");
            }

        } else {
            if (minutes < 0) {
                System.out.println("Minutes cannot be negative numbers");
            } else {
                System.out.println("Game cannot be longer ");

            }
        }
    }
 }