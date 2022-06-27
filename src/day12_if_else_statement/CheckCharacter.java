package day12_if_else_statement;

public class CheckCharacter {
    public static void main(String[] args) {

        //create a class Calculator
        //
        //- do it without Scanner
        //
        //declare and assign 2 number variables
        //declare and assign a char variable for an operator
        //
        //create a calculator based on the operator picked
        //	+ : add num1 and num2
        //	- : minus num1 and num2
        //	* : multiply num1 and num2
        //	/ : divide num1 and num2
        //	any other char: "invalid operator"

        char letter = 'T';
        // if(letter >= 97 && letter <= 122) ==> lowercase

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("Lowercase: " + letter);
        }

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Uppercase: " + letter);
        }

    }
}
