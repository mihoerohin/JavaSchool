package day15_switch;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you citizen?");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you resident?");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("How old are you?");
        int age = input.nextInt();

        if((isCitizen || isCitizen) && hasDiploma && ( age >= 18 && age <= 35)){
            System.out.println("You are qualified for the Army");
        }else{
            if(!isCitizen || !isResident){
                System.out.println("You must be a citizen or a resident");
            }

            if(!hasDiploma) {
                System.out.println("You must have a high school diploma");
            }

            if(age >= 18 || age <= 35){
                System.out.println("tou must be a between 18 to 35 years old");
            }
        }





    }
}
