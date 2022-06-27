package day12_if_else_statement;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hourlyRate = 20;
        double numOfHours = input.nextDouble();
        double netPay;

        if (numOfHours > 40) {

            double overtimeHours =  numOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overtimeHours * hourlyRate * 1.5;
            double overtime = overtimeHours * (hourlyRate * 1.5);
            double pay = hourlyRate * 40;
            System.out.println("Salary: $" + pay);
            System.out.println("Overtime: $" + overtime);
            System.out.println("Netpay + overtime: $" + netPay);

        }else{
            netPay = numOfHours * hourlyRate;
            System.out.println("Netpay: " + netPay);

        }
        

    }
}
