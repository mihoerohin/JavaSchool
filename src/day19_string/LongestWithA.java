package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        if(wordOne.contains("a") && wordOne.length() > wordTwo.length() && wordOne.length() > wordThree.length()){
            System.out.println(wordOne + " is the biggest with a");

        }else if(wordTwo.contains("a") && wordTwo.length() > wordOne.length() && wordTwo.length() > wordThree.length()){
            System.out.println(wordTwo + " is the biggest with a");

        }else if(wordThree.contains("a") && wordThree.length() > wordOne.length() && wordThree.length() > wordTwo.length()){
            System.out.println(wordThree + " is the biggest");

        }else{
            System.out.println("No single largest word with a");
        }
    }
}
