package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* ask the user to enter their name including titles
use the following titles to determine how to refer to the person as

handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

	titles:

		Mr or Mister
		Ms or Miss or Madam
		Dr

	and some titles can come after a name:

		Sr
		Jr

Based on both starting and ending titles print the following messages:

		Mr or Mister: Hello Sir
		Ms or Miss or Madam: Hello Ma'am
		Dr: Hello Doctor

		Sr: Nice to meet you Senior
		Jr: Nice to meet you Junior

Note: It is possible to have both beginning and ending titles, one of them, or none of them
*/
        System.out.println("enter your name including titles");
         String name = input.next().toLowerCase();


         if(name.startsWith("Mr") || name.startsWith("mister")){
             System.out.println("Hello Sir");

         }else if(name.startsWith("Miss") || name.startsWith("Madam") || name.startsWith("Ms")){
             System.out.println("Hello Ma'am");

         }else if(name.startsWith("Dr")){
             System.out.println("Hello Doctor");

         }

         if (name.endsWith(" sr")){
             System.out.println("Nice to meet you Senior");

         } else if(name.endsWith(" jr")) {
             System.out.println("Nice to meet you Junior");
         }
    }
}
