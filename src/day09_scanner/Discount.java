package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isInTheWeekend = true;
        boolean areYouTeacher = false;
        boolean areYouPoliceOfficer = false;
        boolean areYouFirefighter = true;

        boolean getDiscount = isInTheWeekend &&
                (areYouTeacher || areYouPoliceOfficer || areYouFirefighter);

        System.out.println(getDiscount);


    }
}
