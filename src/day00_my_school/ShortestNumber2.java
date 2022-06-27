package day00_my_school;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestNumber2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] words = str.split(", ");

        String s = words[0];
        String shortest = "";

        

        for(int i = 1; i < words.length; i++){
            if(words[i].length() < s.length()){
                s = words[i];
            }
        }
        for(int w = 0; w < words.length; w++ ){
            if(s.length() == words[w].length()){
                shortest += words[w] + " ";
            }
        }
        String[] shortWords = shortest.split(" ");
        System.out.println(Arrays.toString(shortWords));


    }

}
