package day00_my_school;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        //   apple, banana, kiwi, grape, milk, soda, juice, coffee


        
        for (int i = 0; i < 8; i++){
            arr[i] = input.nextLine();
        }


        for(int s = 1; s < arr.length; s++){
            System.out.println(arr[s - 1] + " " + arr[s]);
        }


    }
}
