package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you hungry? True or false...");
        boolean hungrySo =input.nextBoolean();

        
        if (!hungrySo){
            System.out.println("Great, then practice java");

        }else{
            System.out.println("You are hungry, so I will some food for you");

        }
    }
}
