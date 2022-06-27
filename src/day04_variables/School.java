package day04_variables;

public class School {
    //class name: School
    //
    //declare and assign these variables
    //    number of students in grade 1
    //    number of students in grade 2
    //    number of students in grade 3
    //    number of students in grade 4
    //    number of students in grade 5
    //
    //    total number of students in your school
    //
    //    number of days in a year (have some half day = ~ 100.5)
    //    average gpa in school
    //
    //    print all of the variables with unique messages

    public static void main(String[] args) {

        int grade1 = 4;
        int grade2 = 2;
        int grade3 = 3;
        int grade4 = 4;
        int grade5 = 5;

        System.out.println("\nClass name: School\n");
        System.out.println("student 1: " + grade1);
        System.out.println("student 2: " + grade2);
        System.out.println("student 3: " + grade3);
        System.out.println("student 4: " + grade4);
        System.out.println("student 5: " + grade5);

        int TotalStudents = grade1 + grade2 + grade3 + grade4 + grade5;

        System.out.println("\nTotal number of students: " + TotalStudents);


        double dayInYear = 102.3;
        double SnowDays = 4.5;
        double AverageGPA = 3.5;

        System.out.println("\nTotal number of day: "+dayInYear);
        System.out.println("Snow days: "+SnowDays);
        System.out.println("Average GPA: "+AverageGPA);




    }
}
