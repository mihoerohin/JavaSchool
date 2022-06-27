package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temperature = input.nextInt();
         

        int isTemperature = temperature;
        if(isTemperature >= 70) {
            System.out.println("\nIt's nice day");
            System.out.println("go outside");
        }else{
            System.out.println("To cold");
            System.out.println("Practice java at home");
        }
    }
}
