package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First name ");
        String firstName = input.next();

        System.out.println("Last name ");
        String lastName = input.next();
        
        System.out.println("Employed ");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Student ");
        boolean isStudent = input.nextBoolean();

        String details = firstName + " " + lastName + " is employed: " + isEmployed + " and they are a student: " + isStudent;

        System.out.println(details);

    }
}
