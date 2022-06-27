package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {


        String [] studentOne = {"007", "James", "Bond", "7"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo = new String[4];

        System.out.println(Arrays.toString(studentTwo));

        studentTwo[0] = "010";
        studentTwo[1] = "Jamie";
        studentTwo[2] = "Smith";
        studentTwo[3] = "43";

        System.out.println(Arrays.toString(studentTwo));
        /*
        String [] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID");
        studentThree[0] = input.nextLine();
        System.out.println("Enter your first name");
        studentThree[1] = input.nextLine();
        System.out.println("Enter your last name");
        studentThree[2] = input.nextLine();
        System.out.println("What is your batch number");
        studentThree[3] = input.nextLine();

        System.out.println(Arrays.toString(studentThree));
         */

        Scanner input = new Scanner(System.in);

        String [] studentFour = new String[4];
        String [] question  = {"Enter your ID", "Enter your first name", "Enter your last name", "What is your batch number"} ;

        for(int i = 0; i < 4; i++){
            System.out.println(question[i]);
            studentFour[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(studentFour));


    }
}
