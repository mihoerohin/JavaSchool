package day12_if_else_statement;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //create a class ChooseLanguage
        //
        //ask the user to enter a number based on the language they wanted to use.
        //	1 - English
        //	2 - Spanish
        //	3 - Turkish
        //	4 - Russian
        //	5 - French
        //based on the number they picked print a message:
        //
        //	1 : "hello, thank for your call"
        //    2 : "hola, gracias para llamar"
        //    3 : "merhaba, aradiginiz icin tesekkurler"
        //    4 : "privet, spasibo za vash zvonok"
        //    5 : "Merci ,pour votre appel"
        //    any other number: "We will use English by default"


        System.out.println("*******************************************************");
        System.out.println("Enter a number based on the language they wanted to use:\n" +
                "1 - English\n" +
                "2 - Spanish\n" +
                "3 - Turkish\n" +
                "4 - Russian\n" +
                "5 - French");
        String  number1 = "English", number2 = "Spanish", number3 = "Turkish", number4 = "Russian", number5 = "French";
        int language = input.nextInt();

        if (language == 1){
            System.out.println(number1 + "" +
                    "; hello, thank for your call");
        }else if(language == 2){
            System.out.println(number2 + ": hola, gracias para llamar");
        }else if(language == 3){
            System.out.println(number3 + ": merhaba, aradiginiz icin tesekkurler");
        }else if(language == 4){
            System.out.println(number4 + ": privet, spasibo za vash zvonok");
        }else if(language == 5){
            System.out.println(number5 + ": Merci ,pour votre appel");
        }else{
            System.out.println("False number, please use only number 1, 2, 3, 4, 5");
        }
    }
}
