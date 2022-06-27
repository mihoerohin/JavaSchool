package day09_scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Janna Erohina";
        boolean areCitizen = true;
        boolean doHaveCriminalBackground = true;
        int age = 31;

        boolean isEligibleToVote = age >= 18 && areCitizen && doHaveCriminalBackground;

        System.out.println("\nName: " + name + ", age " + age + "\nCitizen: " + areCitizen + "\nCriminal background: " + doHaveCriminalBackground + "\nIs Eligible To Vote: " + isEligibleToVote);
    }
}
