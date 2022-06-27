package day16_switch;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the grade");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it");
        int attempt = input.nextInt();

        if (attempt == 1){
             grade = grade - (int)(grade * 0.1);
        }else if(attempt == 2){
             grade -= grade * 0.2;
        }else if(attempt == 3){
             grade *= 0.65;
        }else{
            System.out.println("Not valid attempt number");
        }
        System.out.println(grade);
    }
}
