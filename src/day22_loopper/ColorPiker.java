package day22_loopper;

import java.util.Scanner;

public class ColorPiker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int colorsPicked = 0;
        String uniqueColors = "";

        while(colorsPicked < 3){

            System.out.println("pick a color");
            String color = input.nextLine();
            
             if(uniqueColors.contains(color)) {
                System.out.println("you already have that color");
            }  else {
                uniqueColors += color + " ";
                colorsPicked++;
            }

        }
        System.out.println(uniqueColors);
    }
}
