package day15_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt

         */

        int grade = input.nextInt();
        String location = "", teacher = "";
        int numGroups = 0;

          if(grade == 1){
              location = "Apple orchard";
              numGroups =  3;
              teacher = "Ms. Smith";

          }else if(grade == 2){
              location = "Zoo";
              numGroups = 7;
              teacher = "Mr. Lee";

          }else if(grade == 3){
              location = "Aquarium";
              numGroups = 5;
              teacher = "Ms. Wilson";

          }else if(grade == 4){
              location = "Movie theater";
              numGroups = 2;
              teacher = "Ms. Reyes";

          }else if(grade == 5){
              location = "Museum";
              numGroups = 5;
              teacher = "Ms. Lela";

          }else if(grade ==6){
              location = "Six Flags";
              numGroups = 8;
              teacher = "Mr. Watt";
          }else{
              System.out.println("no grade number " + grade);
          }


        System.out.println("grade: " + grade);
        System.out.println("location: " + location);
        System.out.println("number of groups: " + numGroups);
        System.out.println("teacher in charge: " + teacher);

    }
}
