package day00_my_school;

import java.util.Scanner;

public class Bread {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW


        if(str.indexOf("bread") < str.lastIndexOf("bread")){
            System.out.println(str.substring((str.indexOf("bread") + 5), (str.lastIndexOf("bread"))));

        }else{
            System.out.println("nothing");
        }



        
    }
}
