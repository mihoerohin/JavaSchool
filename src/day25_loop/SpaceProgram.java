package day25_loop;

import java.util.Scanner;

public class SpaceProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a sentence");
        String str = input.nextLine();
        String fixed = "";

        for(int i = 0; i < str.length(); i++){

            if (str.charAt(i) == ' '){
                fixed += "_ ";
            }else{
                fixed+=str.charAt(i) + ".";
            }
        }
        System.out.println(fixed.trim());


    }
}
