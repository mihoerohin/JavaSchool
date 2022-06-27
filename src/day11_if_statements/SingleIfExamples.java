package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {

        if (false){
            System.out.println("Hello world");
        }

        System.out.println("second line");

        if (true){

            System.out.println("Hi");
        }

        int score = 50;
        if (score >= 22){
            System.out.println("Passing\n");
        }

        if (score < 70) {
            System.out.println("Failing\n");
        }

        int year = 2021;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown) {
            System.out.println("Stay at home");
            System.out.println("Practice java");
            System.out.println("Wera mask");
        }

        if (!lockdown) {  // !FALSE ==> TRUE
            System.out.println("Party");
            System.out.println("Maybe travel");
            System.out.println("Still practice java");

        }

    }
}
