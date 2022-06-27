package day04_variables;

public class PrintDate {
    /* task:
                    declare and assign 3 variables
                    the month number, the day number, and year number

                    print the date in the following format:
                          month/day/year
             */
    public static void main(String[] args) {

        int month = 12;
        int day = 22;
        int year = 1987;

        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "_" + day + "_" + year);
        System.out.println(month + "." + day + "." + year);

    }
}
