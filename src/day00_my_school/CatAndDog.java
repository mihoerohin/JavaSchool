package day00_my_school;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        int countDog = 0;
        int countCat = 0;

        for(int animal = 0; animal <= str.length() - 1; animal++){

            if(str.contains("cat")){
                str = str.replaceFirst("cat", "***");
                countCat++;
            }

            if(str.contains("dog")){
                str = str.replaceFirst("dog", "***");
                countDog++;
            }

        }

        if(countCat == countDog){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
    }
}
