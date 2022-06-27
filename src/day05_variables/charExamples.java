package day05_variables;

public class charExamples {
    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne + letterTwo);

        char letterThree = 65; //char letterThree = 'A';
        System.out.println(letterThree);

        char num1 = 127;
        System.out.println(num1);

        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);
        // original: 97 + 90 + 65 + 57 + 36

        System.out.println(letterOne + " " + letterTwo + " " + letterThree + " " + numberOne);
        // spaces between each char

        System.out.println("char: " + letterOne + letterTwo + letterThree + numberOne + specialOne); //string in the beginning







    }
}
