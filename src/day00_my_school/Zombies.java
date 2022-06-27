package day00_my_school;

import java.util.Scanner;

public class Zombies {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;

        while(inhabitants >= 1){

            System.out.println(day + " Day " + "[" + inhabitants + "]");
            day++;
            inhabitants /= 2;
            
        }
        System.out.println("---- EXTINCT ----");
    }
}
