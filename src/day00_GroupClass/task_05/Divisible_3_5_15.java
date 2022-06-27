package day00_GroupClass.task_05;

import java.util.List;

public class Divisible_3_5_15 {
    public static void main(String[] args) {


        divisible_3_5_15(111);

    }

    public static void divisible_3_5_15(int number){

        System.out.print("Divisible By 15 => ");
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible By 5 => ");
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible By 3 => ");
            for (int i = 1; i <= number; i++) {
            if(i % 3 == 0){
                System.out.print(i + " ");
            }

        }

    }
}
