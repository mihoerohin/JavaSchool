package day14_if_statements;

import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    boolean a = true;
    boolean b = true;
    boolean c = false;

    if (a){
        System.out.println(1);
        if (b){
            System.out.println(2);
          if (c){
             System.out.println(3);
          }else{
             System.out.println(4);
          }
        }

    }else{
        System.out.println("Z");
    }


    }
}

