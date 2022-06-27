package day06_variable;

public class SalaryCalculator {
    public static void main(String[] args) {

       /* salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

        Sample date:
        100000 (salary)
                0.08 (state tax rate)
        0.21 (federal tax rate)

        Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

                Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes

        */

        double salary = 10_000, stateTaxRate = 0.08, federalTaxRate = 0.21, stateTax = stateTaxRate * salary, federalTax = federalTaxRate * salary, totalTax = federalTax + stateTax, salaryAfterTax = salary - totalTax;


        System.out.println("\nSalary: $" + salary +"\nFederal tax: $" + federalTax + "\nState tax: $" + stateTax + "\nTotal tax: $" + totalTax + "\nSalary after tax: $" + salaryAfterTax);

    }
}
