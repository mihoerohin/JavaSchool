package day15_switch;

import java.util.Scanner;

public class StarBucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which size: tall, grande or venti?");
        String size = input.next();
        String info = "";
        boolean validOfOrder = true;


        switch (size){
            case "tall":
                info = "\tTall\n\tPrice $2.50\n\tCalories 100";
                break;
            case "grande":
                info = "\tGrande\n\tPrice $4.50\n\tCalories 150";
                break;
            case "venti":
                info = "\tVenti\n\tPrice 6.00\n\tCalories 230";
                break;
            default:
                System.out.println("--------------------------------\nIncorrect, try again...");
                validOfOrder = false;

        }
        if (validOfOrder) {
            System.out.println(info);
            
        }
    }
}
