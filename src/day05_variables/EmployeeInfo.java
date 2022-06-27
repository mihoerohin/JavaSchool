package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {


        String FirstName = "Miho";
        String LastName = "Erohin";
        char gender = 'M';
        byte age = 34;
        String companyName = "Atlantida";
        boolean AreTheFullTime = true;
        String JobTitle = "Technician";
        long salary = 120000;
        long PhoneNumber = 9172449482L;
        boolean married = false;
        char suite = 'B';

        String fullDetails = "\nEmployee information for " + FirstName + " " + LastName + ".\nGender: " + gender + ", age: " + age + "\nCompany name: " + companyName + ", full time " + AreTheFullTime + ", " + JobTitle + "\nSalary: $" + salary + "\nMarried: " + married + "\nPhone number: " + PhoneNumber;

        System.out.println(fullDetails);


    }

}
