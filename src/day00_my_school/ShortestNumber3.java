package day00_my_school;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestNumber3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int shortest = 0;
        String same = "";

        String [] words = str.split(", ");
        


        for(int i = 1; i < words.length; i++){
                shortest = words[i].length();
            

        }
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == shortest){
                same += words[i] + ", ";

            }

        }

        String [] arr = same.split(", ");
        System.out.println(Arrays.toString(arr));

    }
}
