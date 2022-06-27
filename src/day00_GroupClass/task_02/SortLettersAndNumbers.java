package day00_GroupClass.task_02;

import java.util.Arrays;

public class SortLettersAndNumbers {

    /*
     String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:

Input:  "DC501GCCCA098911"

OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        System.out.println(Alphanumeric("DC501GCCCA098911"));
    }

    public static String Alphanumeric(String word){

        String letters = "";
        String nums = "";

        for (int i = 0; i < word.length(); i++) {

            for (char upper = 'A'; upper <= 'Z'; upper++) {     // count UpperCase
                if (word.charAt(i) == upper){
                    letters += word.charAt(i);
                    nums += " ";
                }
            }
            for (char digit = '0'; digit <= '9'; digit++) {     // count LowerCase
                if (word.charAt(i) == digit){
                    nums += word.charAt(i);
                    letters += " ";
                }
            }
        }

        String[] letterArray = letters.split(" ");
        String[] numArray = nums.split(" ");


        return Arrays.toString(letterArray) + Arrays.toString(numArray);
    }
}
